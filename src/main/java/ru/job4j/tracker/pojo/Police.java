package ru.job4j.tracker.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Александр Банников");
        license.setModel("Skoda");
        license.setCode("xxx777x");
        license.setCreated(new Date());
        System.out.println(
                license.getOwner()
                + " has a car - "
                + license.getModel()
                + " : " + license.getCode()

        );
    }
}