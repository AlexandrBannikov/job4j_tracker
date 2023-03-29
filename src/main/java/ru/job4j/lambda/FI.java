package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 2", 120),
                new Attachment("image 3", 78),
                new Attachment("image 4", 54),
                new Attachment("image 5", 33)
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(atts, comparator);
        System.out.print(Arrays.toString(atts));

    }
}
