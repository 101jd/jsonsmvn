package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Test implements Serializable {
    Value value;
    char ch;

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
