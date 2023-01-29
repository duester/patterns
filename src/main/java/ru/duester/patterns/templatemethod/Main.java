package ru.duester.patterns.templatemethod;

import ru.duester.patterns.templatemethod.institution.School;
import ru.duester.patterns.templatemethod.institution.University;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.learn();
        System.out.println("");

        University university = new University();
        university.learn();
    }
}
