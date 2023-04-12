package ru.job4j.map;

public record Student(String name, String account, String group) {

    public Object getAccount() {
        return account;
    }
}
