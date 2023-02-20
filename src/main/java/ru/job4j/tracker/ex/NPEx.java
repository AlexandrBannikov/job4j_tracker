package ru.job4j.tracker.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Alexandr Bannikov";
        for (String el : shops) {
            if (el != null) {
                System.out.println(el + " has a size: " + el.length());
            }
        }
    }
}
