package ru.job4j.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] names = {"petr", null, "Ivan", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
