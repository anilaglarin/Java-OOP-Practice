
package com.mycompany.vize;


public class Vize {

    public static void main(String[] args) {
        // Aggregation için dışarıda oluşturulan Instructor nesneleri
Instructor i1 = new Instructor("Nagihan Yagmur", "Dr. Ogr. Uyesi");
Instructor i2 = new Instructor("Mahmut", "Dr. Ogr. Uyesi");
Instructor[] instructors = {i1, i2};
University university = new University("DPU", instructors);
Student s1 = new Student("Ayse", 101);
GraduateStudent s2 = new GraduateStudent("Merve", 201, "Artificial Intelligence");
university.displayInfo();
System.out.println("------------------");
university.listDetails();
System.out.println("------------------");
s1.displayInfo();
s2.displayGraduateInfo();
    }
}
