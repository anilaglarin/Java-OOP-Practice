
package i2;


public class Kedi extends Hayvan{
    
    public Kedi(String tur){
    super(tur);
    }
    
    @Override
    public void sesCikar() {
        System.out.println(getTur() + " mırlıyor.");
    }
    
}
