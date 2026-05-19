package com.mycompany.vize;

public class University {

    private String universityName;
    private Department[] departments; // composition

    public University(String universityName, Instructor[] instructors) {
        this.universityName = universityName;
// Composition: Department nesneleri constructor içinde oluşturuluyor
        this.departments = new Department[2];
        this.departments[0] = new Department("Computer Engineering", instructors);
        this.departments[1] = new Department("Software Engineering", instructors);

    }

    public void displayInfo() {
        System.out.println("University: " + universityName);
    }

    public void listDetails() {
        for (Department department : departments) {
            department.displayInfo();
            department.listDetails();

        }
    }
}
