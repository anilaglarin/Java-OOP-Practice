package com.mycompany.kompozisyon2;

public class Kompozisyon2 {

    public static void main(String[] args) {

        Student s1 = new Student("Ayşe", 1001);
        Student s2 = new Student("Fatma", 456);
        Student[] students = {s1, s2};

        Instructor i1 = new Instructor("Ahmet", "Dr.");
        Instructor i2 = new Instructor("Ahmet", "Dr.");
        Instructor[] instructors = {i1, i2};
        
        
        University u1=new University("DPÜ", students, instructors);
        u1.displayInfo();
    }

}
