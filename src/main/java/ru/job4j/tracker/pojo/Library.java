package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 654);
        Book spring = new Book("Spring, complete guide", 590);
        Book java = new Book("Java, complete guide", 695);
        Book springFast = new Book("Spring is Fast", 630);
        Book[] book = new Book[4];
        book[0] = cleanCode;
        book[1] = spring;
        book[2] = java;
        book[3] = springFast;
        for (Book b : book) {
            System.out.println(b.getName() + " : " + b.getNumberPages());
        }
        System.out.println();
        System.out.println("Поменять местами книги.");
        Book tmp = book[0];
        book[0] = book[3];
        book[3] = tmp;
        for (Book b : book) {
            System.out.println(b.getName() + " : " + b.getNumberPages());
        }
        System.out.println();
        System.out.println("Добавить цикл с выводом книги \"Clean code\"");
        for (Book b : book) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " : " + b.getNumberPages());
            }
        }
    }
}
