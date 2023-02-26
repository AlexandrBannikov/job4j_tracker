package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
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
        if (!checkDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!checkSymbols(password)) {
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

    public static boolean checkDigit(String password) {
        char[] ch = password.toCharArray();
        for (char s : ch) {
            if (Character.isDigit(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSymbols(String password) {
        for (int i = 0; i < password.length(); i++) {
            int code = password.codePointAt(i);
            if (code >= 33 && code <= 47) {
                return true;
            }
        } return false;
    }
}
