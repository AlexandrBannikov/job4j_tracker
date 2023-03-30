package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceUsageConsumer {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String for Interface.";
        Consumer<String> cons = (s) -> System.out.println(s);
        cons.accept(sup.get());
        System.out.println();
        BiConsumer<String, String> bic = (s, s1) -> System.out.println(s + s1);
        bic.accept(sup.get(), " And second String.");
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supp = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = supp.get();
        int i = 1;
        for (String string : strings) {
            consumer.accept(i++, "." + " is " + string);
        }
    }
}
