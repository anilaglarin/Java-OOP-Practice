
package com.mycompany.kompozisyon1;


public class Car {
    private String model;
    private int yil;
    private Engine engine;
    
    public Car(String model , int yil , String engineType){
    this.model=model;
    this.yil=yil;
    this.engine=new Engine(engineType); //composition
    
    }
    
    public void start(){
        
    this.engine.start(); //this.engine ile tekrar eriştim 
    
        System.out.println(this.model+ " is running");
    
    
    
    }
    
    
    
}
