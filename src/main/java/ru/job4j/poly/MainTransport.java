package ru.job4j.poly;

public class MainTransport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(45);
        System.out.println(bus.refill(60));
    }
}
