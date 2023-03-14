package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 9, 12, 45, 23);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second); // входящее значение больше чем текущий значение.
        System.out.println(rsl);
        String petr = "Petr";
        String ivan = "Ivan";
        int rslt = petr.compareTo(ivan); //больше нуля если текущее значение больше чем входящее.
        System.out.println(rslt);
    }
}
