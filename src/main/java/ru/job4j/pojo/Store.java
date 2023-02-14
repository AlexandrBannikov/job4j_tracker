package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for (Product pr : prods) {
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
        prods[1] = null;
        int rslNull = Shop.indexOfNull(prods);
        System.out.println("Индекс который в массиве содержит ссылку null: " + rslNull);
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;
        for (Product pr : prods) {
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("Show only product > 10");
        for (Product pr : prods) {
            if (pr != null && pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        int rsl = Shop.indexOfNull(prods);
        System.out.println("Размер массива - " + prods.length);
        System.out.println("ЯИндекс который в массиве содержит ссылку null: " + rsl);
    }
}
