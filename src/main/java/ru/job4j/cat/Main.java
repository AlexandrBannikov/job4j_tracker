package ru.job4j.cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}
