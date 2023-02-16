package ru.job4j.oop.typeconversion;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " поезд едет по рельсам.");
    }

    @Override
    public void road() {
        System.out.println(getClass().getSimpleName() + " передвигается только по железной дороге.");
    }
}
