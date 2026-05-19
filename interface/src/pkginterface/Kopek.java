
package pkginterface;


public class Kopek extends Hayvan{
    
    public Kopek(String tur){
    super(tur);
    }
    
    @Override
    public void sesCıkar(){
        System.out.println(getTur()+"hav hav");
    }
   
   
}
