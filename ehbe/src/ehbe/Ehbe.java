
package ehbe;

public class Ehbe {

    public static void main(String[] args) {
        Product pr1 = new Product("Laptop", 1500, 90);
        Product pr2 = new Product("Mouse", 50, 80);
        Product pr3 = new Product("Keyboard", 100, 70);
        Product pr4 = new Product("Monitor", 400, 85);
        Product pr5 = new Product("Headphones", 120, 95);

        Product[] products = {pr1, pr2, pr3, pr4, pr5};
        pr1.setPrice(1);
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Toplam Sepet Fiyatı:" + cart.totalPrice());
        System.out.println("En pahalı ürünü indexi:" + cart.mostExpensiveProduct());
    }

}
