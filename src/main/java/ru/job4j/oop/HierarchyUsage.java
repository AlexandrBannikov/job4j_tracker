package ru.job4j.oop;

/**
 * - создаем объекта класса Car.
 *  Car car = new Car();
 * - делаем приведение к типу родителя Transport.
 *  Transport tp = car; - upcasting
 * - делаем приведение к типу родителя Object.
 *  Object obj = car; - upcasting
 * - Приведение типа при создании объекта.
 *  Object ocar = new Car();
 * - Приведение типа за счет понижения по иерархии.
 *  Car carFromObject = (Car) ocar; - down casting
 * - Ошибка в приведении типа.
 *   Object bicycle = new Bicycle();
 *   Car cb = (Car) bicycle; -  код завершится с ошибкой приведения типов ClassCastException
 */
public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tr = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle;
    }
}
