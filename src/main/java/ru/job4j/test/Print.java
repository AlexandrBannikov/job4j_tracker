package ru.job4j.test;

import java.util.Calendar;

public class Print {

    public static void getGreetingAndTime(String name) {
        Calendar cal = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, cal, cal));
    }

    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
    }

    public static void main(String[] args) {
         getGreeting("Александр", 45);
         getGreetingAndTime("Александр");
    }
}
