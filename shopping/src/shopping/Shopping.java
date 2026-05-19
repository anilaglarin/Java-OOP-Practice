package shopping;

public class Shopping {

    public static void main(String[] args) {

        Product pr1 = new Product("Laptop", 1500, 90);
        Product pr2 = new Product("Mause", 50, 80);
        Product pr3 = new Product("Keybord", 100, 70);
        Product pr4 = new Product("Monitör", 400, 85);
        Product pr5 = new Product("Headphones", 120, 95);

        Product[] products = {pr1, pr2, pr3, pr4, pr5};

        ShoppingCart cart=new ShoppingCart(products);
        
        System.out.println("Toplam sepet fiyatı:"+cart.totalPrice());
    }

}
