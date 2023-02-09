package ru.job4j.tracker.oop;

public class Track extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа.");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление.");
    }
}
