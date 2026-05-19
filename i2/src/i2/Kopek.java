
package i2;


public class Kopek extends Hayvan implements Egitilebilir{
    
    public Kopek(String tur){
    super(tur);
    }
    
    @Override
     public void sesCikar() { //boş metot dolacak !!!
        System.out.println(getTur() + " havlıyor.");
    }
     
     @Override
    public void egitimVer() {
        System.out.println(getTur() + " itaat eğitimi alıyor.");
    }
    
    
}
