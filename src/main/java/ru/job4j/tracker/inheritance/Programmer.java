package ru.job4j.tracker.inheritance;

public class Programmer extends Engineer {

    private String programLang;

    public Programmer(boolean degree, int experience, String programLang) {
        super(degree, experience);
        this.programLang = programLang;
    }
}
