package ru.job4j.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FunctionInterfaceUsagePredicate {
    public static void main(String[] args) {
        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));
        System.out.println();
        BiPredicate<String, Integer> predicate = (s, i) -> s.contains(i.toString());
        System.out.println("Строка содержит подстроку: " + predicate.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + predicate.test("Name", 123));
    }
}
