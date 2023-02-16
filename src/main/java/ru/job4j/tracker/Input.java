package ru.job4j.tracker;

/**
 * Интерфейс input
 * Метод, который возвращает введенную строку от пользователя.
 * Метод, который возвращает введенное число от пользователя.
 */
public interface Input {

    String askString(String question);

    int askInt(String question);
}
