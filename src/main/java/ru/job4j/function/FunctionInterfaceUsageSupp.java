package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsageSupp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String for Interface.";
        System.out.println(supplier.get());
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        Set<String> strings = sup.get();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
