package ru.job4j.test;

import java.util.LinkedList;

public class Collect {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(0, "Stepan");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
