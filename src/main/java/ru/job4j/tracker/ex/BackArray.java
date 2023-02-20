package ru.job4j.tracker.ex;

import java.util.Arrays;

public class BackArray {

    public static void main(String[] args) {

        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int i = 0; i <= middle; i++) {
            String tmp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(names));
    }
}
