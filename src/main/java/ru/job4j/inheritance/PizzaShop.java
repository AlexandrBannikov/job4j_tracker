package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.name());
        PizzaExtraCheese extra = new PizzaExtraCheese();
        System.out.println(extra.name());
        PizzaExtraCheeseExtraTomato tomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(tomato.name());
    }
}
