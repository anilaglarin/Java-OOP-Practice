
package i3;


public class I3 {

    public static void main(String[] args) {
      
        Calisan memur=new Memur("Ali", 300);
        Calisan isci=new Isci("Mehmet",400);
        
        Personel.genelBilgi(); //override edilemez sadece interface ismi ile çağrılır 
        
        //calsslarda override edilmiş metotlar
        memur.calis();
        isci.calis();
        
        //personel interfaceinden gelen defaolut metotlar !!!
        memur.raporVer();
        isci.raporVer();
        
        
        // Çalışan sayısını, interface'deki sabit değişkeni çağırabiliriz
        System.out.println("Toplam çalışan sayısı: " + Personel.CALISAN_SAYISI);
    }
    
}
