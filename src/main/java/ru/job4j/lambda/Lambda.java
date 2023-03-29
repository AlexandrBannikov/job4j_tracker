package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        String[] str = {
                "one",
                "two",
                "three",
                "four",
                "five"
        };
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Arrays.sort(str, cmpText);
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();

        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        Arrays.sort(str, cmpDescSize);
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
