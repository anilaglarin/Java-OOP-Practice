package team;

// Arrays.toString() kullanabilmek için bu kütüphaneyi eklemelisin
import java.util.Arrays;

public class Team {

    public static void main(String[] args) {
        
        // 1. Nesne: Boş yapılandırıcı ve Setter kullanımı
        Player p1 = new Player();
        p1.setAttack(100);
        p1.setDefanse(120); // Player sınıfındaki isimlendirmene göre yazdım
        System.out.println("P1 Hasar: " + p1.hasarHesapla());
        
        // 2. Nesne: Parametreli yapılandırıcı
        int attack = 100;
        int defense = 120;
        Player p2 = new Player(attack, defense);
        System.out.println("P2 Hasar: " + p2.hasarHesapla());
        
        // 3. Nesne: Dizi alan yapılandırıcı
        int[] attack1 = {100, 200, 300, 400};
        int[] defense1 = {20, 30, 40, 50};

        Player p3 = new Player(attack1, defense1);
        
        // Diziyi ekrana yazdırmak için Arrays.toString() şarttır
        System.out.println("P3 Hasar Dizisi: " + Arrays.toString(p3.hasarHesaplaDizi()));
    }
}