package com.mycompany.kompozisyon2;

public class Classroom {

    private String roomName;
    private int capacity;

    public Classroom(String roomName, int capacity) {

        this.roomName = roomName;
        this.capacity = capacity;

    }

    public String displayInfo() {

        return "Sinif:" + roomName + "Kapasite:" + capacity;

    }

}
