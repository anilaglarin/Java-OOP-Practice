/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ehbe;

public class Product {

    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {     //conturactor yapısı 

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
    
    //Ürünün idirimli fiyatını hesapla 
    
    public double discountedPrice(double discountPercentage){
        
     double discounted= price * (1 - discountPercentage / 100);
     
     if(discounted<0){
     return -1;
     }else{
     return discounted;
     }
    
    }
    
    
    
    

}
