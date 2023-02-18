package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        int id = input.askInt("Enter id.");
        String name = input.askString("Enter name.");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("The application has been successfully changed.");
        } else {
            System.out.println("Application replacement error!");
        }
        return true;
    }
}
