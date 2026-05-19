package teamss;

public class Team {

    private Player[] players;

    public Team(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {  //türü dizi olduğu için tip Player[]
        return players;
    }

    public void setPlayer(Player[] players) {
        this.players = players;
    }

    public int toplamHasar() {
        int toplam = 0;

        for (int i = 0; i < players.length; i++) {
            toplam+=players[i].hasarHesaplama();
        }
        return toplam;
    }
}
