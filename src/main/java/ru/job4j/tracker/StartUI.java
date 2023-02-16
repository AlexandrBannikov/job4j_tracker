package ru.job4j.tracker;
public class StartUI {
    public void init(Input input, Tracker tracker) {
        while (true) {
            showMenu();
            int select = input.askInt("Select: ");
            if (select == 1) {
                System.out.println("=== Create a new Item ===");
                String name = input.askString("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Added application: " + item);
            } else if (select == 2) {
                System.out.println("=== Show all Items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("The repository does not contain applications.");
                }
            } else if (select == 3) {
                System.out.println("=== Edit Item ===");
                int id = input.askInt("Enter id.");
                String name = input.askString("Enter name.");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("The application has been successfully changed.");
                } else {
                    System.out.println("Application replacement error!");
                }
            } else if (select == 4) {
                System.out.println("=== Delete Item ===");
                int id = input.askInt("Enter id:");
                if (tracker.delete(id)) {
                    System.out.println("The application was deleted successfully.");
                } else {
                    System.out.println("Request deletion error.");
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by id ===");
                int id = input.askInt("Enter id:");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("The application with the entered id: " + id + " was not found.");
                }
            } else if (select == 6) {
                System.out.println("=== Find items by name ===");
                String name = input.askString("Enter name:");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Applications with the name: " + name + " were not found.");
                }
            } else if (select == 7) {
                System.out.println("Вы выбрали \"Exit program\" - " + select + ".");
                break;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item.", "Show all items.", "Edit item.",
                "Delete item.", "Find item by id.", "Find items by name.",
                "Exit Program."
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
