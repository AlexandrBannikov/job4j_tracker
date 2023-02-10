package ru.job4j.tracker.inheritance;

public class Cat extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    public static void staticInstance() {
        System.out.println("Вызов статического метода Cat");
    }
}
