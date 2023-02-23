package ru.job4j.tracker.ex;

import org.junit.jupiter.api.Test;
import ru.job4j.ex.Fact;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("n must not be less than 0");
    }

    @Test
    public void when4To24() {
        int number = 4;
        int result = Fact.calc(number);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}