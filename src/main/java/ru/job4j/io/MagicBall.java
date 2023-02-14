package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        while (true) {
            String string = scanner.nextLine();
            System.out.println(string);
            int answer = new Random().nextInt(3);
            if (answer == 0) {
                System.out.println("Да");
            } else if (answer == 1) {
                System.out.println("Нет");
            } else {
                System.out.println("Может быть");
            }
        }
    }
}
