package com.mycompany.kompozisyon2;

public class Department {

    
    
     private String name;
    private Classroom[] classrooms;
    private Student[] students;
    private Instructor[] instructors;

    public Department(String name, Student[] students, Instructor[] instructors) {
        this.name = name;
        this.students = students;
        this.instructors = instructors;

        // Composition: Classroom nesneleri burada oluşturuluyor
        classrooms = new Classroom[2];
        classrooms[0] = new Classroom("A101", 40);
        classrooms[1] = new Classroom("B202", 35);
    }

    public void displayInfo() {
        System.out.println("Bolum: " + name);

        System.out.println("Siniflar:");
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.displayInfo());
        }

        System.out.println("Ogrenciler:");
        for (Student student : students) {
            System.out.println(student.displayInfo());
        }

        System.out.println("Ogretim Elemanlari:");
        for (Instructor instructor : instructors) {
            System.out.println(instructor.displayInfo());
        }
    }
    
   
}


