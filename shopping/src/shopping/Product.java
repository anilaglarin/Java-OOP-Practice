package shopping;

public class Product {

    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Ürünün indirimli fiyatını hesapla
    public double discountedPrice(double discountPercentage) {                     //discountedPrice metodun ismi //double discountPercentage

        double discounted = price * (1 - discountPercentage / 100);
        if (discounted < 0) {
            return 0;
        } else {
            return discounted;
        }

    }

}
