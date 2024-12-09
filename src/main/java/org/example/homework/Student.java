package org.example.homework;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(name)
                .append("\t")
                .append(age)
                .append("\t")
                .append(GPA)
                .toString();
    }
}
