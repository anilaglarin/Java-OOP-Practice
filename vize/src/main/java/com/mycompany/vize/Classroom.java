package com.mycompany.vize;

public class Classroom {

    private String roomName;
    private int capacity;

    public Classroom(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public String getRoomName(){
    return roomName;
    }
    public void setRoomName(String roomName){
    this.roomName=roomName;
    }
    
    public void displayInfo(){
        System.out.println("Oda ismi:"+roomName+"Kapasite:"+capacity);
    }
    
}
