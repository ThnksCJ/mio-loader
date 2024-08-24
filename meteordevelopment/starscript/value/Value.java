/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript.value;

import java.util.function.Supplier;
import meteordevelopment.starscript.utils.SFunction;
import meteordevelopment.starscript.value.ValueMap;
import meteordevelopment.starscript.value.ValueType;

public class Value {
    private static final Value NULL = new Value(ValueType.Null);
    private static final Value TRUE = new Boolean(true);
    private static final Value FALSE = new Boolean(false);
    public final ValueType type;

    private Value(ValueType type) {
        this.type = type;
    }

    public static Value null_() {
        return NULL;
    }

    public static Value bool(boolean bool) {
        return bool ? TRUE : FALSE;
    }

    public static Value number(double number) {
        return new Number(number);
    }

    public static Value string(String string) {
        return new VString(string);
    }

    public static Value function(SFunction function) {
        return new Function(function);
    }

    public static Value map(ValueMap fields) {
        return new Map(fields);
    }

    public boolean isNull() {
        return this.type == ValueType.Null;
    }

    public boolean isBool() {
        return this.type == ValueType.Boolean;
    }

    public boolean isNumber() {
        return this.type == ValueType.Number;
    }

    public boolean isString() {
        return this.type == ValueType.String;
    }

    public boolean isFunction() {
        return this.type == ValueType.Function;
    }

    public boolean isMap() {
        return this.type == ValueType.Map;
    }

    public boolean getBool() {
        return ((Boolean)this).bool;
    }

    public double getNumber() {
        return ((Number)this).number;
    }

    public String getString() {
        return ((VString)this).string;
    }

    public SFunction getFunction() {
        return ((Function)this).function;
    }

    public ValueMap getMap() {
        return ((Map)this).fields;
    }

    public boolean isTruthy() {
        switch (this.type) {
            default: {
                return false;
            }
            case Boolean: {
                return this.getBool();
            }
            case Number: 
            case String: 
            case Function: 
            case Map: 
        }
        return true;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Value value = (Value)o;
        if (this.type != value.type) {
            return false;
        }
        switch (this.type) {
            case Null: {
                return true;
            }
            case Boolean: {
                return this.getBool() == value.getBool();
            }
            case Number: {
                return this.getNumber() == value.getNumber();
            }
            case String: {
                return this.getString().equals(value.getString());
            }
            case Function: {
                return this.getFunction() == value.getFunction();
            }
            case Map: {
                return this.getMap() == value.getMap();
            }
        }
        return false;
    }

    public int hashCode() {
        int result = super.hashCode();
        switch (this.type) {
            case Boolean: {
                result = 31 * result + (this.getBool() ? 1 : 0);
                break;
            }
            case Number: {
                long temp = Double.doubleToLongBits(this.getNumber());
                result = 31 * result + (int)(temp ^ temp >>> 32);
                break;
            }
            case String: {
                String string = this.getString();
                result = 31 * result + string.hashCode();
                break;
            }
            case Function: {
                result = 31 * result + this.getFunction().hashCode();
                break;
            }
            case Map: {
                result = 31 * result + this.getMap().hashCode();
            }
        }
        return result;
    }

    public String toString() {
        switch (this.type) {
            case Null: {
                return "null";
            }
            case Boolean: {
                return this.getBool() ? "true" : "false";
            }
            case Number: {
                double n = this.getNumber();
                return n % 1.0 == 0.0 ? Integer.toString((int)n) : Double.toString(n);
            }
            case String: {
                return this.getString();
            }
            case Function: {
                return "<function>";
            }
            case Map: {
                Supplier<Value> s = this.getMap().get("_toString");
                return s == null ? "<map>" : s.get().toString();
            }
        }
        return "";
    }

    private static class Number
    extends Value {
        private final double number;

        private Number(double number) {
            super(ValueType.Number);
            this.number = number;
        }
    }

    private static class VString
    extends Value {
        private final String string;

        private VString(String string) {
            super(ValueType.String);
            this.string = string;
        }
    }

    private static class Function
    extends Value {
        private final SFunction function;

        public Function(SFunction function) {
            super(ValueType.Function);
            this.function = function;
        }
    }

    private static class Map
    extends Value {
        private final ValueMap fields;

        public Map(ValueMap fields) {
            super(ValueType.Map);
            this.fields = fields;
        }
    }

    private static class Boolean
    extends Value {
        private final boolean bool;

        private Boolean(boolean bool) {
            super(ValueType.Boolean);
            this.bool = bool;
        }
    }
}

