package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to02then3dot0() {
        Point a = new Point(0, 5);
        Point b = new Point(0, 2);
        double expected = 3.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to02then1dot0() {
        Point a = new Point(0, 3);
        Point b = new Point(0, 2);
        double expected = 1.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to02then2dot0() {
        Point a = new Point(0, 4);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3D() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double expected = 1.73;
        double rsl = a.distance3d(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when000to0221then3() {
        double expected = 3;
        var a = new Point(0, 0, 0);
        var b = new Point(2, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}