package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when2() {
        int number = Max.max(3, 4);
        assertThat(number, is(4));
    }

    @Test
    public void when3() {
        int number = Max.max(1, 3, 7);
        assertThat(number, is(7));
    }

    @Test
    public void when4() {
        int number = Max.max(1, 3, 6, 9);
        assertThat(number, is(9));
    }
}