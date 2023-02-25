package ru.job4j.tracker;

/**
 * 1. Обеспечить бесперебойную работу приложения Tracker [#789 #394846]
 */
public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid date.");
            }
        } while (invalid);
        return value;
    }
}
