package pkg2026.bahar;

public class Java2026Bahar {

    public static void notAnalizi(int[] notlar) {

        if (notlar.length == 0) {
            System.out.println("Dizi boş.");
            return;
        }

        int toplam = 0;
        int gecen = 0;
        int kalan = 0;
        int enYuksek = notlar[0];

        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];

            if (notlar[i] >= 50) {
                gecen++;
            } else {
                kalan++;
            }

            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
        }

        double ortalama = (double) toplam / notlar.length;

        System.out.println("Ortalama: " + ortalama);
        System.out.println("Geçen sayısı: " + gecen);
        System.out.println("Kalan sayısı: " + kalan);
        System.out.println("En yüksek not: " + enYuksek);
    }

    public static void main(String[] args) {

        int[] notlar = {75, 40, 90, 55, 30, 100};

        notAnalizi(notlar);
    }
}
