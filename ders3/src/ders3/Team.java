/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ders3;

public class Team {

    private int[] attack;
    private int[] defanse;

    public Team() {

    }

    public Team(int[] attack, int[] defanse) {

        this.attack = attack;
        this.defanse = defanse;
    }

    public int[] getAttack() {
        return attack;
    }

    public void setAttcak(int[] attack) {
        this.attack = attack;
    }

    public int[] getDefanse() {
        return defanse;
    }

    public void setDefanse(int[] defanse) {
        this.defanse = defanse;
    }

    public int hasarHesaplama(int index) {
        if (index < 0 || index > this.attack.length) {   //kontrol amaçlı 
            return -1;
        }
        int hasar = attack[index] - (defanse[index] / 2);
        if (hasar > 0) {
            return hasar;
        }
        return 0;
    }

    public int toplamHasar() {
        int toplam = 0;
        for (int i = 0; i < defanse.length; i++) {
            toplam += hasarHesaplama(i);
        }
        return toplam;
    }

    public int enIyıOyuncu() {

        int maxHasar = -1;
        int index = -1;

        for (int i = 0; i < attack.length; i++) {
            int hasar = hasarHesaplama(i);

            if (hasar > maxHasar) {
                maxHasar = hasar;
                index = i;
            }
        }
        return index;
    }

    public int[] esikUstuOyuncular(int esik) {
		int[] sonuc = new int[attack.length];

		for(int i = 0; i < attack.length; i++) {
		if(hasarHesaplama(i) > esik) {
		sonuc[i] = i;
		} else {
		sonuc[i] = -1;
		}
		}

		return sonuc;
		}

}
