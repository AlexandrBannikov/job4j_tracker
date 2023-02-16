package ru.job4j.oop.typeconversion;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по скоростной трассе.");
    }

    @Override
    public void road() {
        System.out.println(getClass().getSimpleName() + " маршруты движения только по выделенным полосам.");
    }
}
