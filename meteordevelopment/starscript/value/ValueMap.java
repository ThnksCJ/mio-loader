/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript.value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import meteordevelopment.starscript.utils.SFunction;
import meteordevelopment.starscript.value.Value;

public class ValueMap {
    private final Map<String, Supplier<Value>> values = new HashMap<String, Supplier<Value>>();

    public ValueMap set(String name, Supplier<Value> supplier) {
        this.values.put(name, supplier);
        return this;
    }

    public ValueMap set(String name, Value value) {
        this.set(name, () -> value);
        return this;
    }

    public ValueMap set(String name, boolean bool) {
        return this.set(name, Value.bool(bool));
    }

    public ValueMap set(String name, double number) {
        return this.set(name, Value.number(number));
    }

    public ValueMap set(String name, String string) {
        return this.set(name, Value.string(string));
    }

    public ValueMap set(String name, SFunction function) {
        return this.set(name, Value.function(function));
    }

    public ValueMap set(String name, ValueMap map) {
        return this.set(name, Value.map(map));
    }

    public Supplier<Value> get(String name) {
        return this.values.get(name);
    }

    public Set<String> keys() {
        return this.values.keySet();
    }
}

