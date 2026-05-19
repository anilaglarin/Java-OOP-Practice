/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfizm;

/**
 *
 * @author anila
 */
public class OgretimUyesi extends Calisan {

    public OgretimUyesi(String ad) {
        super(ad);
    }
    
    @Override
     public void gorevYap() {
        System.out.println(ad + " ders veriyor ve araştırma yapıyor.");
    }
      public void hoca() {
        System.out.println(ad + "bos isler");
    }
    
}
