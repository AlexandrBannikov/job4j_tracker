package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int count);

    default double refill(double fuelQuantity) {
        return 0;
    }
}
