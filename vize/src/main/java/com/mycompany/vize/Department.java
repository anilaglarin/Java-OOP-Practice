package com.mycompany.vize;

public class Department {

    private String departmentName;
    private Instructor[] instructors; //aggregation
    private Classroom[] classrooms; //compositions

    //constracutes oluştururken içeri composition gönderilmez !!!!
    public Department(String departmentName, Instructor[] instructors) {
        this.departmentName = departmentName;
        this.instructors = instructors;

        // Composition: Classroom nesneleri constructor içinde oluşturuluyor
        this.classrooms = new Classroom[2];
        this.classrooms[0] = new Classroom("A202", 40);
        this.classrooms[1] = new Classroom("A303", 50);
    }

    public void displayInfo() {
System.out.println("Department: " + departmentName);
}
public void listDetails(){
System.out.println("Instructors:");

for(Instructor instructor :instructors){
instructor.displayInfo();
}

System.out.println("Classrooms:");
for(Classroom classroom:classrooms){
classroom.displayInfo();
}
}


    
}
