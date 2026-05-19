package pratik;
import java.util.Scanner;
public class Pratik {
    public static void main(String[] args) {
       int notunuz;
       Scanner klavye= new Scanner (System.in);
       System.out.print("Notunuzu giriniz------>");
       notunuz=klavye.nextInt();
       if(notunuz>85){
           System.out.println("AA");
       }
       else if((notunuz<85)&&(notunuz>=70)){
           System.out.println("BA");
       }
       else if((notunuz<70)&&(notunuz>=65)){
           System.out.println("BB");
       }
    }
}
