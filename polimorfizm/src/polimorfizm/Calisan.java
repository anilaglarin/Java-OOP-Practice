package polimorfizm;

public class Calisan {

    protected String ad;

    Calisan(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void gorevYap() {
        System.out.println(ad + "calısıyor");
    }

}
