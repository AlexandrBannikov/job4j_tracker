package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int minLength = Math.min(o1.length(), o2.length());
        for (int i = 0; i < minLength; i++) {
            result = Character.compare(o1.charAt(i), o2.charAt(i));
            if (result != 0) {
                break;
            }
        }
        return result != 0 ? result : Integer.compare(o1.length(), o2.length());
    }
}
