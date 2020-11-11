package javaapplication2;

public class Restaurant {
    private String name;
    private int price;
    
    public Restaurant(String name,int price){
    this.name =name;
    this.price = price;
    }

    public String getName() {
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
