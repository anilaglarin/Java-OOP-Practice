
package i2;


public class I2 {

    
    public static void main(String[] args) {
        
        Hayvan kedi = new Kedi("Van Kedisi");
        Hayvan kopek = new Kopek("Golden Retriever");
        Hayvan kus = new Kus("Muhabbet Kuşu");

        Hayvan[] hayvanlar = { kedi, kopek, kus };
        
        
        for (Hayvan h : hayvanlar) {
            h.sesCikar();
            h.bilgiVer();

            // Egitilebilir mi?
            if (h instanceof Egitilebilir) {
                ((Egitilebilir) h).egitimVer();
            }

            System.out.println("---");
        }
    }
        
        
        
    }
    
}
