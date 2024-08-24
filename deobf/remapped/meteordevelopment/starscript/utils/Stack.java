/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.starscript.utils;

public class Stack<T> {
    private T[] items = new Object[8];
    private int size;

    public void clear() {
        for (int i = 0; i < this.size; ++i) {
            this.items[i] = null;
        }
        this.size = 0;
    }

    public void push(T item) {
        if (this.size >= this.items.length) {
            Object[] newItems = new Object[this.items.length * 2];
            System.arraycopy(this.items, 0, newItems, 0, this.items.length);
            this.items = newItems;
        }
        this.items[this.size++] = item;
    }

    public T pop() {
        T item = this.items[--this.size];
        this.items[this.size] = null;
        return item;
    }

    public T peek() {
        return this.items[this.size - 1];
    }

    public T peek(int offset) {
        return this.items[this.size - 1 - offset];
    }
}

