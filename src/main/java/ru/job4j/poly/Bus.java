package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Маршрутный автобус.");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Количество пассажиров входит в данный тип автобуса - " + passenger);
    }

    @Override
    public double refill(double fuelQuantity) {
        double price = 45.0;
        return price * fuelQuantity;
    }
}
