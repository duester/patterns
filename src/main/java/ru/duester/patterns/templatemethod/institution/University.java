package ru.duester.patterns.templatemethod.institution;

public class University extends EducationalInstitution {
    @Override
    public void enter() {
        System.out.println("Поступаем в вуз.");
    }

    @Override
    public void study() {
        System.out.println("Ходим на лекции.");
        System.out.println("Ходим на семинары.");
    }

    @Override
    public void getDocument() {
        System.out.println("Получаем диплом.");
    }
}
