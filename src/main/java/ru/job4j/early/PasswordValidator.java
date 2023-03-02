package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        boolean isDigit = false;
        boolean isSpecSymbol = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        char[] symbols = password.toCharArray();
        for (char symbol : symbols) {
            if (Character.isDigit(symbol)) {
                isDigit = true;
            }
            if (!Character.isDigit(symbol) && !Character.isLetter(symbol)) {
                isSpecSymbol = true;
            }
        }

        if (!isDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (checkSubstring(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;

    }

    public static boolean checkSubstring(String password) {
        String[] pass = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : pass) {
            if (password.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }
}
