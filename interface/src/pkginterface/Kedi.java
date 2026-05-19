
package pkginterface;


public class Kedi extends Hayvan{
    
    public Kedi(String tur){
    super(tur);
    }
    
    @Override
    public void sesCıkar(){
        System.out.println(getTur()+ "mrrr mrrrr");
    }
  
}
