package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import static org.assertj.core.api.Assertions.assertThat;

public class SchoolTest {

    @Test
    public void whenCollectClass() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9")
        );
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() >= 70;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname7"));
        expected.add(new Student(90, "Surname9"));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname5"),
                new Student(60, "Surname6"),
                new Student(80, "Surname8")
        );
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() >= 50
                && student.getScore() < 70;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname6"),
                new Student(90, "Surname9")
        );
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() < 50;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenInputListNotHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Sidorov")
        );
        Map<String, Student> result = School.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(50, "Sidorov"));
        assertThat(result).containsAllEntriesOf(expected);
    }

    @Test
    public void whenInputListHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Ivanov"),
                new Student(60, "Sidorov"),
                new Student(70, "Petrov")
        );
        Map<String, Student> result = School.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(60, "Sidorov"));
        assertThat(result).containsAllEntriesOf(expected);
    }
}