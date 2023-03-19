package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String s : deps) {
            String start = "";
            for (String el : s.split("/")) {
                start += start.length() > 0 ? "/" + el : el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
}
