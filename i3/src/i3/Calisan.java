
package i3;


public abstract class Calisan implements Personel{
    
    private String ad;
    private int maas;
    
    public Calisan(String ad , int maas){
    this.maas=maas;
    this.ad=ad;
    }
    
    public String getAd(){
    return ad;
    }
    
    public void setAd(String ad){
    this.ad=ad;
    }
    
    public int getMaas(){
    return maas;
    }
    
    public void setMaas(int maas){
    this.maas=maas;
    }
    
    @Override
   public  void calis(){
     System.out.println(ad + " çalışıyor.");
    }
   
   
   
    // 'raporVer' metodu interface'den gelmişti, bu metodu override edebiliriz, fakat biz default olarak bırakacağız
    // Böylece tüm sınıflar bu metodu kullanabilir
    
    
}
