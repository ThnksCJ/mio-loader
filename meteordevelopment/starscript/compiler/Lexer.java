/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript.compiler;

import meteordevelopment.starscript.compiler.Token;

public class Lexer {
    public Token token;
    public String lexeme;
    public int line = 1;
    public int character = -1;
    public char ch;
    private final String source;
    public int start;
    public int current;
    private int expressionDepth;

    public Lexer(String source) {
        this.source = source;
    }

    public void next() {
        this.start = this.current;
        if (this.isAtEnd()) {
            this.createToken(Token.EOF);
            return;
        }
        if (this.expressionDepth > 0) {
            this.skipWhitespace();
            if (this.isAtEnd()) {
                this.createToken(Token.EOF);
                return;
            }
            char c2 = this.advance();
            if (this.isDigit(c2) || c2 == '-' && this.isDigit(this.peek())) {
                this.number();
            } else if (this.isAlpha(c2)) {
                this.identifier();
            } else {
                switch (c2) {
                    case '\"': 
                    case '\'': {
                        this.string();
                        break;
                    }
                    case '=': {
                        if (this.match('=')) {
                            this.createToken(Token.EqualEqual);
                            break;
                        }
                        this.unexpected();
                        break;
                    }
                    case '!': {
                        this.createToken(this.match('=') ? Token.BangEqual : Token.Bang);
                        break;
                    }
                    case '>': {
                        this.createToken(this.match('=') ? Token.GreaterEqual : Token.Greater);
                        break;
                    }
                    case '<': {
                        this.createToken(this.match('=') ? Token.LessEqual : Token.Less);
                        break;
                    }
                    case '+': {
                        this.createToken(Token.Plus);
                        break;
                    }
                    case '-': {
                        this.createToken(Token.Minus);
                        break;
                    }
                    case '*': {
                        this.createToken(Token.Star);
                        break;
                    }
                    case '/': {
                        this.createToken(Token.Slash);
                        break;
                    }
                    case '%': {
                        this.createToken(Token.Percentage);
                        break;
                    }
                    case '^': {
                        this.createToken(Token.UpArrow);
                        break;
                    }
                    case '.': {
                        this.createToken(Token.Dot);
                        break;
                    }
                    case ',': {
                        this.createToken(Token.Comma);
                        break;
                    }
                    case '?': {
                        this.createToken(Token.QuestionMark);
                        break;
                    }
                    case ':': {
                        this.createToken(Token.Colon);
                        break;
                    }
                    case '(': {
                        this.createToken(Token.LeftParen);
                        break;
                    }
                    case ')': {
                        this.createToken(Token.RightParen);
                        break;
                    }
                    case '{': {
                        ++this.expressionDepth;
                        this.createToken(Token.LeftBrace);
                        break;
                    }
                    case '}': {
                        --this.expressionDepth;
                        this.createToken(Token.RightBrace);
                        break;
                    }
                    case '#': {
                        while (this.isDigit(this.peek())) {
                            this.advance();
                        }
                        this.createToken(Token.Section, this.source.substring(this.start + 1, this.current));
                        break;
                    }
                    default: {
                        this.unexpected();
                    }
                }
            }
        } else {
            char c3 = this.advance();
            if (c3 == '\n') {
                ++this.line;
            }
            if (c3 == '{') {
                ++this.expressionDepth;
                this.createToken(Token.LeftBrace);
            } else if (c3 == '#') {
                while (this.isDigit(this.peek())) {
                    this.advance();
                }
                this.createToken(Token.Section, this.source.substring(this.start + 1, this.current));
            } else {
                while (!this.isAtEnd() && this.peek() != '{' && this.peek() != '#') {
                    if (this.peek() == '\n') {
                        ++this.line;
                    }
                    this.advance();
                }
                this.createToken(Token.String);
            }
        }
    }

    private void string() {
        while (!this.isAtEnd() && this.peek() != '\"' && this.peek() != '\'') {
            if (this.peek() == '\n') {
                ++this.line;
            }
            this.advance();
        }
        if (this.isAtEnd()) {
            this.createToken(Token.Error, "Unterminated expression.");
        } else {
            this.advance();
            this.createToken(Token.String, this.source.substring(this.start + 1, this.current - 1));
        }
    }

    private void number() {
        while (this.isDigit(this.peek())) {
            this.advance();
        }
        if (this.peek() == '.' && this.isDigit(this.peekNext())) {
            this.advance();
            while (this.isDigit(this.peek())) {
                this.advance();
            }
        }
        this.createToken(Token.Number);
    }

    private void identifier() {
        while (!this.isAtEnd() && this.isAlphaNumeric(this.peek())) {
            this.advance();
        }
        this.createToken(Token.Identifier);
        switch (this.lexeme) {
            case "null": {
                this.token = Token.Null;
                break;
            }
            case "true": {
                this.token = Token.True;
                break;
            }
            case "false": {
                this.token = Token.False;
                break;
            }
            case "and": {
                this.token = Token.And;
                break;
            }
            case "or": {
                this.token = Token.Or;
            }
        }
    }

    private void skipWhitespace() {
        block4: while (true) {
            if (this.isAtEnd()) {
                return;
            }
            char c2 = this.peek();
            switch (c2) {
                case '\t': 
                case '\r': 
                case ' ': {
                    this.advance();
                    continue block4;
                }
                case '\n': {
                    ++this.line;
                    this.advance();
                    continue block4;
                }
            }
            break;
        }
        this.start = this.current;
    }

    private void unexpected() {
        this.createToken(Token.Error, "Unexpected character.");
    }

    private void createToken(Token token, String lexeme) {
        this.token = token;
        this.lexeme = lexeme;
    }

    private void createToken(Token token) {
        this.createToken(token, this.source.substring(this.start, this.current));
    }

    private boolean match(char expected) {
        if (this.isAtEnd()) {
            return false;
        }
        if (this.source.charAt(this.current) != expected) {
            return false;
        }
        this.advance();
        return true;
    }

    private char advance() {
        ++this.character;
        this.ch = this.source.charAt(this.current++);
        return this.ch;
    }

    private char peek() {
        if (this.isAtEnd()) {
            return '\u0000';
        }
        return this.source.charAt(this.current);
    }

    private char peekNext() {
        if (this.current + 1 >= this.source.length()) {
            return '\u0000';
        }
        return this.source.charAt(this.current + 1);
    }

    private boolean isAtEnd() {
        return this.current >= this.source.length();
    }

    private boolean isDigit(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private boolean isAlpha(char c2) {
        return c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 == '_';
    }

    private boolean isAlphaNumeric(char c2) {
        return this.isAlpha(c2) || this.isDigit(c2);
    }
}

