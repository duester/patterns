package ru.duester.patterns.templatemethod.institution;

public class School extends EducationalInstitution {
    @Override
    public void enter() {
        System.out.println("идём в 1-й класс.");
    }

    @Override
    public void study() {
        System.out.println("Ходим на уроки, делаем домашку.");
    }

    @Override
    public void getDocument() {
        System.out.println("Получаем аттестат.");
    }
}
