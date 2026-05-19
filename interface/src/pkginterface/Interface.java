
package pkginterface;


public class Interface {

    
    public static void main(String[] args) {
        
        Hayvan kedi=new Kedi("Van kedisi");
        Hayvan kopek=new Kopek("Golden");
        Hayvan kus=new Kus("Kartal");
        
        kus.sesCıkar();
        kedi.sesCıkar();
        kopek.sesCıkar();
        
        Hayvan serce=new Kus("Serce");
        serce.sesCıkar();
        
        if (serce instanceof Ucan ucanKus) {
           ucanKus.uc();
}
        
        
        
    }
    
}
