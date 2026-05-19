package polimorfizm;
import java.util.ArrayList;


public class Polimorfizm {

    public static void main(String[] args) {
        
        ArrayList<Calisan> calisanlar = new ArrayList<>();
        
        calisanlar.add(new Memur("Ahmet"));
        calisanlar.add(new OgretimUyesi("Mehmet"));
        calisanlar.add(new Akademisyen("Merve"));
        
        // 1. DÖNGÜ: İşlemleri Yapma
        for (Calisan c : calisanlar) {
            c.gorevYap();
            
            // Pattern Matching for instanceof (Java 16+)
            if (c instanceof Memur a) {
                System.out.println("Bu adam memur");
                a.raporIncele();
            } 
            else if (c instanceof OgretimUyesi p) {
                System.out.println("Hoca bu"); // err yerine out kullanımı daha temizdir
                p.hoca();
            } 
            else if (c instanceof Akademisyen b) {
                System.out.println("Sınav okur bu adam");
                b.sınav();
            }
        }

        System.out.println("\n--- Silme İşlemi Sonrası Liste ---");

        // 2. HATA DÜZELTME: Döngü içinde eleman silme
        // Döngü bittikten sonra silme yapmalısın veya Iterator kullanmalısın.
        if (!calisanlar.isEmpty()) {
            calisanlar.remove(0); // İlk elemanı güvenli bir şekilde siler
        }
        
        // Kalan listeyi yazdır
        for (Calisan c : calisanlar) {
            // Calisan sınıfında toString() metodu override edilmiş olmalıdır
          //  System.out.println(c.getName() + " hala listede."); 
        }
    }
}