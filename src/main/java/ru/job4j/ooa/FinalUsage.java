package ru.job4j.ooa;

public class FinalUsage {
    private static final String NAME_1 = "Александр Банников";

    public static void main(String[] args) {
        final String NAME = "Александр";
        System.out.println(NAME);
        System.out.println(NAME_1);
    }
}
