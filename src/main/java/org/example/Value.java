package org.example;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Value implements Serializable {
    private int intVal;
    private String stringVal;

    public Value(int intVal, String stringVal) {
        this.intVal = intVal;
        this.stringVal = stringVal;
    }

    @Override
    public String toString() {
        return "Value{" +
                "intVal=" + intVal +
                ", stringVal='" + stringVal + '\'' +
                '}';
    }
}
