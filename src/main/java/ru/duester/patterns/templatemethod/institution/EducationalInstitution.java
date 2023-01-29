package ru.duester.patterns.templatemethod.institution;

public abstract class EducationalInstitution {
    public void learn() {
        enter();
        study();
        getDocument();
    }

    public abstract void enter();

    public abstract void study();

    public abstract void getDocument();
}
