package hu.unideb.inf.model;

import java.time.LocalDate;

public class Model {
    private Student student;

    public Model() {
        this.student = new Student();
        student.setName("Robert Smith");
        student.setCredits(32);
        student.setDateOfBirth(LocalDate.of(2001,10,15));
    }

    public Student getStudent(){
        return student;
    }
}
