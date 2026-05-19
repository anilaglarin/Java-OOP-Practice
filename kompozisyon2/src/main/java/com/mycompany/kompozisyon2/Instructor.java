/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kompozisyon2;

public class Instructor {

    private String name;
    private String title;

    public Instructor(String name, String title) {

        this.name = name;
        this.title = title;
    }

    public String displayInfo() {

        return "Ogertim Elemanı" + name + ",Unvan" + title;
    }
}
