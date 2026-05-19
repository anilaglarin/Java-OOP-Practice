
package i3;

/**
 *
 * @author anila
 */
public interface Personel {
    
    int CALISAN_SAYISI=1000;
    
    //gövdesiz metot(abstract)
    void calis();
    
    public default void raporVer(){           //gövdesi olan metotlar implements edilen sınfılar tarafından override edilebilir fakat edilmezse ,interface'teki haliyle kullanılmaya devam eder.
    System.out.println("Rapor veriliyor...");
    }
    
    //!!! static void 
     static void genelBilgi() {  //gittiği sınıfta override edilemez sadece , interface ismi ile çağrılır 
        System.out.println("Bu, tüm çalışanları kapsayan genel bilgi.");
    }
    
}
