package hu.unideb.inf.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {
    private StringProperty name = new SimpleStringProperty();
    private int credits;
    private LocalDate dateOfBirth;

    public String getName() {
        return name.getName();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public StringProperty nameProperty(){
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
