package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("79324177721@mail.ru", "Alexandr Alexandrovich Bannikov");
        map.put("79324177721@mail.ru", "Alexandr Alexandrovich Bannikov");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();
        map.put("79324177721@mail.ru", "Alexandr  Bannikov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
