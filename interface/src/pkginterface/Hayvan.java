
package pkginterface;


public abstract class Hayvan { //bir kalıp gibi
    
    private String tur;
    
    public Hayvan(String tur){
    this.tur=tur;
    }
    
    public String getTur(){
    return tur;
    }
    
    public void setTur(String tur){
    this.tur=tur;
    }
    
    public abstract void sesCıkar(); //her hayvanın sesi farklı olduğu için boş tanımlanır , hayvanlar kendi içinde override eder
    
}
