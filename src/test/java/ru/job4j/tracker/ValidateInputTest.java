package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(1);
    }

    @Test
    public void whenInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"1"});
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:");
        assertThat(select).isEqualTo(1);
    }

    @Test
    public void whenMinusSelect() {
        Output out = new StubOutput();
        Input input = new StubInput(new String[] {"-3"});
        ValidateInput in = new ValidateInput(out, input);
        int select = in.askInt("Enter menu:");
        assertThat(select).isEqualTo(-3);
    }

    @Test
    public void whenALotInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"1", "3"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
    }
}