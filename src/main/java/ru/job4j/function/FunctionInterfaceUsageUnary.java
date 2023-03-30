package ru.job4j.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionInterfaceUsageUnary {
    public static void main(String[] args) {
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test.")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder(".tset rof gnirtS")));
        System.out.println();
        BinaryOperator<StringBuilder> buil = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + buil.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
