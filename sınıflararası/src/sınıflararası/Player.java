package sınıflararası;

public class Player {

    private int attack;
    private int defanse;

    public Player(int attack, int defane) {
        this.attack = attack;
        this.defanse = defane;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefanse() {
        return defanse;
    }

    public void setDefanse(int defanse) {
        this.defanse = defanse;
    }

    public int hasarHesapla() {
        int hasar = attack - (defanse / 2);

        if(hasar>0){
        return hasar;
        }
        return -1;
    }

}
