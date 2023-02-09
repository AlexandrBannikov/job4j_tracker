package ru.job4j.tracker.oop.car;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    public class Transmission {
        public void accelerate() {
            System.out.println("Ускорение.");
        }
     }

     public class Brakes {

        public void brake() {
            System.out.println("Торможение.");
        }
     }

     public class TripComputer {
        public String tripData = "Бортовой компьютер";
        private String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Car.this.model);
        }
     }
}
