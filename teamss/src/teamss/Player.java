
package teamss;


public class Player {
    private int attack;
    private int defanse;
    
    public Player(int attack , int defanse){            //contracture yapım 
    this.attack=attack;
    this.defanse=defanse;
    }
    
    public int getAttack(){
    return attack;
    }
    
    public void setAttacak(int attack){
    this.attack=attack;
    }
    
    public int getDefanse(){
    return defanse;
    }
    
    public void setDefanse(int defanse){
    this.defanse=defanse;
    }
    
    public int hasarHesaplama(){
    int hasar=attack-(defanse/2);
    
    if(hasar>0){
    
    return hasar;
    }else{
    return -1;
    }
    
    }
         
    
    
}
