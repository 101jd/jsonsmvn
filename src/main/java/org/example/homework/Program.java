package org.example.homework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 1:
 * Разработайте класс Student с полями String name, int age7 transient double GPA (средний балл).
 * Обеспечьте поддержку сериализации для этого класса.
 * Создайте объект класса Student и инициализируйте его данными.
 * Сериализируйте этот объект в файл.
 * Десериализируйте объект обратно в программу из файла.
 * Выведите все поля объекта, включая GPA, и обсудите почему значение GPA не было сохранено/восстановлено.
 *
 * Задание 2 (не обязательно):
 * ** Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документов).
 */

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Task 1
        String path = "out.bin";
        String json = "out.json";

        new ObjectOutputStream(new FileOutputStream(path))
                .writeObject(new Student("Ivan", 34, 45.0));
        writejson(json, Arrays.asList(
                new Student("Afanacy", 16, 32.8),
                new Student("Marfa", 18, 42.1)
        ));

        System.out.println("From bin:");
        System.out.println(new ObjectInputStream(new FileInputStream(path))
                .readObject());
        System.out.println("From json:");
        System.out.println(readjson(json));

    }

    public static <T> void writejson(String path, List<T> t) throws IOException {
        new ObjectMapper()
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .writeValue(new File(path), t);
    }

    public static Object readjson(String path) throws IOException {
        return new ObjectMapper().readValue(new File(path), Object.class);
    }
}
