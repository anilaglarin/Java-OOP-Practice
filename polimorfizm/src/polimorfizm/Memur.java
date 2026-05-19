
package polimorfizm;


public class Memur extends Calisan{
    
    Memur(String ad){
    super(ad);
    }
    
    @Override
    public void gorevYap(){
     System.out.println(ad + " evrak işleri yapıyor.");
    }
     public void raporIncele() {
        System.out.println(ad + " rapor inceliyor.");
    }
    
    
    
}
