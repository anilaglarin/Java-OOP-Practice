/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfizm;

/**
 *
 * @author anila
 */
public class Akademisyen extends Calisan{

    public Akademisyen(String ad) {
        super(ad);
    }
    
     @Override
    public void gorevYap() {
        System.out.println(ad + " araştırma yapıyor.");
    }
    
    public void sınav() {
        System.out.println(ad + " araştırma yapıyor.");
    }
    
}
