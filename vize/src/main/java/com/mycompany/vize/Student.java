
package com.mycompany.vize;


public class Student {
   protected String name ;
   protected int studentId;
   
   public Student(String name ,int studentId){
   this.name=name;
   this.studentId=studentId;
   }
   
   public String getName(){
   return name;
   }
   
   public void setName(String name){
   this.name=name;
   }
   
   public int getStudentId(){
   return studentId;
   }
   
   public void setStudentId(int studentId){
   this.studentId=studentId;
   }
   
   public void displayInfo(){
   
       System.out.println("Name:"+name+",ID:"+studentId);
   }
   
   
}
