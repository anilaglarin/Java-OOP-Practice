/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamss;

/**
 *
 * @author anila
 */
public class Teamss {

    public static void main(String[] args) {
        Player p1 = new Player(100, 50);
        Player p2 = new Player(80, 40);
        Player p3 = new Player(80, 40);
        Player p4 = new Player(80, 40);
        Player p5 = new Player(80, 40);
        
       Player[] oyuncular ={p1 , p2 ,p3,p4,p5}; //diziyi teamin içina atamk için 
       
       Team team=new Team(oyuncular);  //obje tanımı 
               
               
         System.out.println("Toplam hasar: " + team.toplamHasar());
         System.out.println("P1 Hasar: " + p1.hasarHesaplama());
        
    }

}
