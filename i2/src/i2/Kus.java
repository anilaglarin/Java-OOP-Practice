
package i2;


public class Kus extends Hayvan{
    
    public Kus(String tur){
    super(tur);
    }
    
    @Override
    public void sesCikar() {
        System.out.println(getTur() + " ötüyor.");
    }
    
    
    
    
}
