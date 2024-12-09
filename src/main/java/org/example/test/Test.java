package org.example.test;

import org.example.Value;

import java.io.Serializable;

public class Test implements Serializable {
    private Value value;
    private char ch;

    public Test(int i, String s, char ch) {
        this.value = new Value(i, s);
        this.ch = ch;
    }

    public Test() {
        this.value = new Value(0, "null");
        this.ch = '#';
    }

    @Override
    public String toString() {
        return "Test{" +
                "value=" + value +
                ", ch=" + ch +
                '}';
    }
}
