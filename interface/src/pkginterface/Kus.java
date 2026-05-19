
package pkginterface;


public class Kus extends Hayvan implements Ucan{
    
    public Kus(String tur){
    super(tur);
    }
    
    @Override
    public void sesCıkar(){
        System.out.println(getTur()+"otuyor");
    }
    
    @Override
    public void uc(){
        System.out.println(getTur()+ "ucuyorrrr");
    }
    
    
    
    
    
    
    
    
    
    
    
}
