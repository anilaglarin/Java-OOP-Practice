package ehbe;

public class ShoppingCart {

    private Product[] products;

    public ShoppingCart(Product[] products) {     //consturacture 
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProduct(Product[] products) {

        this.products = products;

    }

    //toplam spetfiyatı 
    public double totalPrice() {

        double total = 0;

        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;

    }

    //en pahalı ürün indexi 
    public int mostExpensiveProduct() {

        int index = 0;  //en pahalı ürünü 0. index kabul edersek 
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > products[index].getPrice()) {
                index = i;
            }
        }
        return index;
    }

    

}
