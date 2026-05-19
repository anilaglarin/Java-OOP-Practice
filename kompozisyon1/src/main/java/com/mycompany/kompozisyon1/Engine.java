package com.mycompany.kompozisyon1;

public class Engine {

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("you start" + this.type + " engine");
    }

}
