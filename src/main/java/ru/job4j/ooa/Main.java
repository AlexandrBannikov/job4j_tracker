package ru.job4j.ooa;

public class Main {

    public static void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }

    public static void main(String[] args) {
        String name = "Dog";
        change(name);
        System.out.print(name);
        name = change(name);
        System.out.print(name);
    }

    public static String change(String name) {
        name = name + "Cat";
        String surname = "Kotov";
        return surname;
    }
}
