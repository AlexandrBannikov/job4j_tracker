package ru.job4j.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущая дата и время до форматирования: " + currentDateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
        String currentDateTimeFormat = currentDateTime.format(format);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
