
package com.mycompany.kompozisyon2;

public class Student {

 private String name;
 private int studentNo;
 
 public Student(String name , int studentNo){
 
     this.name=name;
     this.studentNo=studentNo;
    
 }
 
 public String displayInfo(){
     
 return "İsim:" +name+ "NO:"+ studentNo;
 
 }
 
 
 
}
