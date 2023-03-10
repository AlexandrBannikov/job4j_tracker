package ru.job4j.tracker;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("You have chosen the \"Exit\".");
        System.out.println();
        return false;
    }
}
