package ru.job4j.oop.typeconversion;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " самолет летит по воздуху.");
    }

    @Override
    public void road() {
        System.out.println(getClass().getSimpleName() + " использует воздушный коридор.");
    }
}
