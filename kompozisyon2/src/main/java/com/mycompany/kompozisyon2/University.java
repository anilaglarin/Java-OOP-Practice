package com.mycompany.kompozisyon2;

public class University {

    private String name;
    private Department[] departments; //composition

    public University(String name , Student[] students, Instructor[] instructors){
    
    this.name=name;
    
    //departmant için composition 
    
    this.departments=new Department[2];
    this.departments[0]=new Department("Yazılım:", students,instructors);
    this.departments[1]=new Department("Kasa:", students,instructors);
    
 
    }
    public void displayInfo(){
    
    
        System.out.println("Name"+name);
    
    for(Department department:departments){
    
    department.displayInfo();
    }
        
    }
    

}
