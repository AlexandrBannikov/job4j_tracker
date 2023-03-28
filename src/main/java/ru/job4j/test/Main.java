package ru.job4j.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        Main ar = new Main();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ri[0] = -1;
        ar.echo();
    }
}
