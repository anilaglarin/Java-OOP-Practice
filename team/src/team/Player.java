package team;

public class Player {
    
    private int attack;
    private int defanse;
    private int attack1[];
    private int defanse1[];

    // 1. Yapılandırıcı (Boş)
   public Player() {
    }

    // 2. Yapılandırıcı (Tekil değerler)
    public Player(int attack, int defanse) {
        this.attack = attack;
        this.defanse = defanse;
    }

    // 3. Yapılandırıcı (Diziler)
    public Player(int attack[], int defanse[]) {
        this.attack1 = attack;
        this.defanse1 = defanse;
    }

    // Getter ve Setter Metotları
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) { // Yazım hatası düzeltildi: setAttacak -> setAttack
        this.attack = attack;
    }

    public int getDefanse() {
        return defanse;
    }

    public void setDefanse(int defanse) {
        this.defanse = defanse;
    }

    // Tekli Hasar Hesaplama
    public int hasarHesapla() {
        int hasar = attack - (defanse / 2);
        if (hasar > 0) {
            return hasar;
        } else {
            return 0;
        }
    } // <-- BU PARANTEZ EKSİKTİ, EKLENDİ.

    // Dizi ile Toplu Hasar Hesaplama
    public int[] hasarHesaplaDizi() {
        int hasarDizi[] = new int[attack1.length];
        for (int i = 0; i < attack1.length; i++) {
            int hasar = attack1[i] - (defanse1[i] / 2);
            if (hasar > 0) {
                hasarDizi[i] = hasar;
            } else {
                hasarDizi[i] = -1;
            }
        }
        return hasarDizi;
    }
}