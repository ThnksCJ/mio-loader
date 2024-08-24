/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript.compiler;

import java.util.ArrayList;
import java.util.List;
import meteordevelopment.starscript.compiler.Expr;
import meteordevelopment.starscript.compiler.Lexer;
import meteordevelopment.starscript.compiler.Token;
import meteordevelopment.starscript.utils.Error;

public class Parser {
    private final Lexer lexer;
    private final TokenData previous = new TokenData();
    private final TokenData current = new TokenData();
    private int expressionDepth;

    private Parser(String source) {
        this.lexer = new Lexer(source);
    }

    private Result parse_() {
        Result result = new Result();
        this.advance();
        while (!this.isAtEnd()) {
            try {
                result.exprs.add(this.statement());
            }
            catch (ParseException e2) {
                result.errors.add(e2.error);
                this.synchronize();
            }
        }
        return result;
    }

    public static Result parse(String source) {
        return new Parser(source).parse_();
    }

    private Expr statement() {
        if (this.match(Token.Section)) {
            if (this.previous.lexeme.isEmpty()) {
                this.error("Expected section index.", null);
            }
            int start = this.previous.start;
            int index = Integer.parseInt(this.previous.lexeme);
            Expr expr = this.expression();
            expr = new Expr.Section(start, this.previous.end, index, expr);
            if (index > 255) {
                this.error("Section index cannot be larger than 255.", expr);
            }
            return expr;
        }
        return this.expression();
    }

    private Expr expression() {
        return this.conditional();
    }

    private Expr conditional() {
        int start = this.previous.start;
        Expr expr = this.and();
        if (this.match(Token.QuestionMark)) {
            Expr trueExpr = this.statement();
            this.consume(Token.Colon, "Expected ':' after first part of condition.", expr);
            Expr falseExpr = this.statement();
            expr = new Expr.Conditional(start, this.previous.end, expr, trueExpr, falseExpr);
        }
        return expr;
    }

    private Expr and() {
        Expr expr = this.or();
        while (this.match(Token.And)) {
            int start = this.previous.start;
            Expr right = this.or();
            expr = new Expr.Logical(start, this.previous.end, expr, Token.And, right);
        }
        return expr;
    }

    private Expr or() {
        Expr expr = this.equality();
        while (this.match(Token.Or)) {
            int start = this.previous.start;
            Expr right = this.equality();
            expr = new Expr.Logical(start, this.previous.end, expr, Token.Or, right);
        }
        return expr;
    }

    private Expr equality() {
        int start = this.previous.start;
        Expr expr = this.comparison();
        while (this.match(Token.EqualEqual, Token.BangEqual)) {
            Token op = this.previous.token;
            Expr right = this.comparison();
            expr = new Expr.Binary(start, this.previous.end, expr, op, right);
        }
        return expr;
    }

    private Expr comparison() {
        int start = this.previous.start;
        Expr expr = this.term();
        while (this.match(Token.Greater, Token.GreaterEqual, Token.Less, Token.LessEqual)) {
            Token op = this.previous.token;
            Expr right = this.term();
            expr = new Expr.Binary(start, this.previous.end, expr, op, right);
        }
        return expr;
    }

    private Expr term() {
        int start = this.previous.start;
        Expr expr = this.factor();
        while (this.match(Token.Plus, Token.Minus)) {
            Token op = this.previous.token;
            Expr right = this.factor();
            expr = new Expr.Binary(start, this.previous.end, expr, op, right);
        }
        return expr;
    }

    private Expr factor() {
        int start = this.previous.start;
        Expr expr = this.unary();
        while (this.match(Token.Star, Token.Slash, Token.Percentage, Token.UpArrow)) {
            Token op = this.previous.token;
            Expr right = this.unary();
            expr = new Expr.Binary(start, this.previous.end, expr, op, right);
        }
        return expr;
    }

    private Expr unary() {
        if (this.match(Token.Bang, Token.Minus)) {
            int start = this.previous.start;
            Token op = this.previous.token;
            Expr right = this.unary();
            return new Expr.Unary(start, this.previous.end, op, right);
        }
        return this.call();
    }

    private Expr call() {
        Expr expr = this.primary();
        int start = this.previous.start;
        while (true) {
            if (this.match(Token.LeftParen)) {
                expr = this.finishCall(expr);
                continue;
            }
            if (!this.match(Token.Dot)) break;
            if (!this.check(Token.Identifier)) {
                expr = new Expr.Get(start, this.current.end, expr, "");
            }
            TokenData name = this.consume(Token.Identifier, "Expected field name after '.'.", expr);
            expr = new Expr.Get(start, this.previous.end, expr, name.lexeme);
        }
        return expr;
    }

    private Expr finishCall(Expr callee) {
        ArrayList<Expr> args = new ArrayList<Expr>(2);
        if (!this.check(Token.RightParen)) {
            do {
                args.add(this.expression());
            } while (this.match(Token.Comma));
        }
        Expr.Call expr = new Expr.Call(callee.start, this.previous.end, callee, args);
        this.consume(Token.RightParen, "Expected ')' after function arguments.", expr);
        return expr;
    }

    private Expr primary() {
        if (this.match(Token.Null)) {
            return new Expr.Null(this.previous.start, this.previous.end);
        }
        if (this.match(Token.String)) {
            return new Expr.String(this.previous.start, this.previous.end, this.previous.lexeme);
        }
        if (this.match(Token.True, Token.False)) {
            return new Expr.Bool(this.previous.start, this.previous.end, this.previous.lexeme.equals("true"));
        }
        if (this.match(Token.Number)) {
            return new Expr.Number(this.previous.start, this.previous.end, Double.parseDouble(this.previous.lexeme));
        }
        if (this.match(Token.Identifier)) {
            return new Expr.Variable(this.previous.start, this.previous.end, this.previous.lexeme);
        }
        if (this.match(Token.LeftParen)) {
            int start = this.previous.start;
            Expr expr = this.statement();
            expr = new Expr.Group(start, this.previous.end, expr);
            this.consume(Token.RightParen, "Expected ')' after expression.", expr);
            return expr;
        }
        if (this.expressionDepth == 0 && this.match(Token.LeftBrace)) {
            Expr expr;
            int start = this.previous.start;
            ++this.expressionDepth;
            try {
                expr = this.statement();
            }
            catch (ParseException e2) {
                if (e2.error.expr == null) {
                    e2.error.expr = new Expr.Block(start, this.previous.end, null);
                }
                throw e2;
            }
            expr = new Expr.Block(start, this.previous.end, expr);
            this.consume(Token.RightBrace, "Expected '}' after expression.", expr);
            --this.expressionDepth;
            return expr;
        }
        this.error("Expected expression.", null);
        return null;
    }

    private void synchronize() {
        while (!this.isAtEnd()) {
            if (this.match(Token.LeftBrace)) {
                ++this.expressionDepth;
                continue;
            }
            if (this.match(Token.RightBrace)) {
                --this.expressionDepth;
                if (this.expressionDepth != 0) continue;
                return;
            }
            this.advance();
        }
    }

    private void error(String message, Expr expr) {
        throw new ParseException(new Error(this.current.line, this.current.character, this.current.ch, message, expr));
    }

    private TokenData consume(Token token, String message, Expr expr) {
        if (this.check(token)) {
            return this.advance();
        }
        this.error(message, expr);
        return null;
    }

    private boolean match(Token ... tokens) {
        for (Token token : tokens) {
            if (!this.check(token)) continue;
            this.advance();
            return true;
        }
        return false;
    }

    private boolean check(Token token) {
        if (this.isAtEnd()) {
            return false;
        }
        return this.current.token == token;
    }

    private TokenData advance() {
        this.previous.set(this.current);
        this.lexer.next();
        this.current.set(this.lexer.token, this.lexer.lexeme, this.lexer.start, this.lexer.current, this.lexer.line, this.lexer.character, this.lexer.ch);
        return this.previous;
    }

    private boolean isAtEnd() {
        return this.current.token == Token.EOF;
    }

    private static class TokenData {
        public Token token;
        public String lexeme;
        public int start;
        public int end;
        public int line;
        public int character;
        public char ch;

        private TokenData() {
        }

        public void set(Token token, String lexeme, int start, int end, int line, int character, char ch) {
            this.token = token;
            this.lexeme = lexeme;
            this.start = start;
            this.end = end;
            this.line = line;
            this.character = character;
            this.ch = ch;
        }

        public void set(TokenData data) {
            this.set(data.token, data.lexeme, data.start, data.end, data.line, data.character, data.ch);
        }

        public String toString() {
            return String.format("%s '%s'", new Object[]{this.token, this.lexeme});
        }
    }

    public static class Result {
        public final List<Expr> exprs = new ArrayList<Expr>();
        public final List<Error> errors = new ArrayList<Error>();

        public boolean hasErrors() {
            return this.errors.size() > 0;
        }
    }

    private static class ParseException
    extends RuntimeException {
        public final Error error;

        public ParseException(Error error) {
            this.error = error;
        }
    }
}

