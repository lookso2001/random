package javaapplication2;

public class Restaurant {
    private RestaurantName name;
    private int price;
    
    public Restaurant(RestaurantName name,int price){
    this.name =name;
    this.price = price;
    }

    public RestaurantName getName() {
    return name;
    }

    public int getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", price=" + price + '}';
    }
}
