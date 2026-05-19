
package sınıflararası;

public class Team {
   
    private Player[] players;
    
    public Team(Player[] players){
    
    this.players=players;
    }
    
    public Player[] getPlayers(){
    return  players;
    }
    
    public void setPlayers(Player[] players){
    
    this.players=players;
 
    }
 
    public int toplamHasar(){
    
    int toplam =0;
    
    for(int i=0 ;i<players.length;i++){
    
    toplam+=players[i].hasarHesapla();
    
    }
    
    return toplam;
    
    }
    
    
    
    
    
    
    
    
}