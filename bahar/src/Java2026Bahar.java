public class Java2026Bahar {

    public static String notAnalizi(int[] notlar) {
      int toplam = 0;
      int gecen = 0;
      int kalan = 0;
      int enYuksek = notlar[0];
      
      for(int i=0 ; i<notlar.length ; i++){
      toplam +=notlar[i];
      if(notlar[i]>=50){
      gecen++;
      }else {
      kalan++;
      }
      if(notlar[i]>enYuksek){
      enYuksek=notlar[i];
      }
      }
double ortalama = (double) toplam / notlar.length;

        return "Ortalama: " + ortalama +
               "\nGeçen sayısı: " + gecen +
               "\nKalan sayısı: " + kalan +
               "\nEn yüksek not: " + enYuksek;
    }
	public static void main(String[] args){
        int[] notlar = {75, 40 , 90 ,55, 30 ,100};
        String sonuc=notAnalizi(notlar);
        System.out.println(sonuc);
        
        }
}  
