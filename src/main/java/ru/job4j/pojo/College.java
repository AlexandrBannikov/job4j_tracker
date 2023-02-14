package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Банников");
        student.setName("Александр");
        student.setPatronymic("Александрович");
        student.setGroup(7);
        student.setEnrolled(new Date());
        System.out.println("Студент: "
        + student.getSurname() + " "
        + student.getName() + " "
        + student.getPatronymic() + " "
        + "группа - " + " "
        + student.getGroup() + " "
        + "дата поступления - "
        + student.getEnrolled()
        );
    }
}
