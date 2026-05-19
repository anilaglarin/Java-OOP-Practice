package sınıflararası;

public class Sınıflararası {

    public static void main(String[] args) {

        Player p1 = new Player(80, 40);
        Player p2 = new Player(100,20);
        Player p3 = new Player(120,30);
        Player p4 = new Player(60,50);
        Player p5 = new Player(150,10);
        
        Player[] oyuncular={p1,p2,p3,p4,p5};
        
        Team team=new Team(oyuncular);
        
        System.out.println("Toplam Hasar:"+team.toplamHasar());
    }
}
