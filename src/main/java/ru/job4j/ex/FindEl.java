package ru.job4j.ex;

import ru.job4j.tracker.ex.ElementNotFoundException;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("This element not found!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] values = {"Москва", "Питер", "Ростов", "Анапа"};
        String key = "Самара";
        try {
            System.out.println(indexOf(values, key));
        } catch (ElementNotFoundException e) {
           e.printStackTrace();
        }
    }
}