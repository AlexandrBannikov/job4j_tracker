package ru.job4j.oop.typeconversion;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] transport = new Vehicle[] {plane, train, bus};
        for (Vehicle v : transport) {
            v.move();
        }
    }
}
