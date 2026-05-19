
package i2;


abstract class Hayvan {
    
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
    
     public abstract void sesCikar(); //her hayvanın özel bir sesi vardır 
    
    public void bilgiVer(){
     System.out.println(tur + " genel bir hayvandır.");
    }
    
    
}
