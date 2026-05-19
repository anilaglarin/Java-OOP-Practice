
package com.mycompany.vize;


public class Instructor {
    
    private String name;
    private String title;
    
    public Instructor(String name,String title){
        
    this.name=name;
    this.title=title;
    
    }
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }
    
    public String getTitle(){
    return title;
    }
    public void setTitle(String title){
    this.title=title;
    }
    
    public void displayInfo(){
        System.out.println("Hoca İsmi:"+name+"Ünvan"+title);
    }
    
    
    
    
}
