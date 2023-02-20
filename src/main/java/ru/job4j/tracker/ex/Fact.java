package ru.job4j.tracker.ex;

public class Fact {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be less than 0");
        }
        int result = 1;
        for (int index = 2; index <= n; index++) {
            result *= index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(4));
    }
}
