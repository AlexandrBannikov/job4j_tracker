package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> predName = person -> person.getName().equals(key);
        Predicate<Person> predSurName = person -> person.getSurname().equals(key);
        Predicate<Person> predPhone = person -> person.getPhone().equals(key);
        Predicate<Person> predAddress = person -> person.getAddress().equals(key);
        Predicate<Person> combine = predName.or(predSurName).or(predPhone).or(predAddress);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
