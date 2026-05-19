/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders3;

/**
 *
 * @author anila
 */
public class Ders3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] attack = {100, 80, 120, 60, 120};
        int[] defanse = {20, 40, 30, 50, 10};

        Team team = new Team(attack, defanse);
        System.out.println("En iyi oyuncu:"+team.enIyıOyuncu());
        //System.out.println(java.util.Arrays.toString(team.esikUstuOyuncular(100)));
        
    }

}
