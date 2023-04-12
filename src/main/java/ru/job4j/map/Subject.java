package ru.job4j.map;

public record Subject(String name, int score) {
    public Object getName() {
        return name;
    }
}
