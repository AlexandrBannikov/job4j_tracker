package ru.job4j.tracker.condition;

public class Max {

    public static int max(int left, int right) {
        int max = left > right ? left : right;
        return max;
    }

    public static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second, max(third, fourth));
    }

    public static void main(String[] args) {

        int rsl = max(3, 5);
        System.out.println(rsl);
    }
}
