package shopping;

public class ShoppingCart {        //kullanıcıın sepete ekledği ürünler

    private Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    //Toplam sepet fiyatı
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
//En pahalı ürünün indexi

    public int mostExpensiveProduct() {
        int index = 0; // Başlangıçta ilk ürünü varsayalım

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > products[index].getPrice()) {
                index = i;
            }
        }

        return index;
    }
      

          


}
