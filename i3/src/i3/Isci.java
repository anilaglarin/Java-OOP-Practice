
package i3;


public class Isci extends Calisan{
    
    public Isci(String ad , int maas){
    super(ad,maas);
    }
    
    // 'calis' metodunu override ediyoruz
    @Override
    public void calis() {
        System.out.println(getAd() + " fabrikada çalışıyor.");
    }

    // 'raporVer' metodu Personel interface'inden default geldiği için biz değiştirmedik
    
    
}
