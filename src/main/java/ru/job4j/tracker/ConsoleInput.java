package ru.job4j.tracker;

import java.util.Scanner;

/**
 * ConsoleInput - класс, который реализует интерфейс Input и который внутри будет работать с классом Scanner.
 */

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askString(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askString(question));
    }
}
