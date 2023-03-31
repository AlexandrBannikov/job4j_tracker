package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator calc = new FunctionCalculator();
        List<Double> rsl = calc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(rsl).containsAll(expected);
    }

    @Test
    public void whenSquadFunctionThenSquadResult() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = List.of(25D, 36D, 49D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenConstantFunctionThenConstantaResult() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = List.of(32D, 64D, 128D);
        assertThat(result).containsAll(expected);
    }
}