package javaapplication2;

import rip.Restaurant;

public class FindRestaurant {

    private Restaurant restaurantlist[];
    private int count = 0;

    public FindRestaurant() {
        this.restaurantlist = new Restaurant[5]; //default
    }

    public FindRestaurant(int r) {
        this.restaurantlist = new Restaurant[r]; //input
    }
    
//    public static Restaurant[] getRestaurant(){
//     Restaurant[] restaurant = new Restaurant[2];
//     restaurant[0] = new Restaurant("Copper",1000);
//     restaurant[1] = new Restaurant("Bonchon",200);
//     return restaurant;    
//    }
//                
    public String PickRestaurant(int price) {
        Restaurant rest[] = new Restaurant[this.count]; //new restaurant arrays
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (this.restaurantlist[i].getPrice() <= price) { //if restaurant+price <= Budget
                rest[count] = restaurantlist[i];   //restaurant that lower than budget
                count++;
            }
        }
        if (count != 0) { 
            int ran = (int) Math.floor(Math.random() * count); //random
            str.append(rest[ran].getName() + " " + rest[ran].getPrice()); //restaurantname + price output
        } else {
            str.append("Not Found");
        }

        return str.toString();
    }
    public String listRestaurant(int price){
        StringBuilder str = new StringBuilder();
        str.append("Rest List");
        str.append("\n---------------------------------------\n");
        for (int i = 0; i < this.count; i++) {
            if (this.restaurantlist[i].getPrice() <= price) { //if restaurant+price <= Budget
                str.append(restaurantlist[i].getName() + " : " + restaurantlist[i].getPrice() + "\n"); 
            }
        }
        return str.toString();
    }

    public boolean isFull() {
        return restaurantlist.length == this.count; //length of restaurantlist = count 
    }

    public boolean addRestaurant(Restaurant r) {
        if (!isFull() && r != null) {
            restaurantlist[count] = r;
            count++;
            return true;
        }
        return false;
    }

    public boolean removeRestaurant(String rname) {
        if (rname != null) {
            for (int i = 0; i < this.count; i++) {
                if (rname == restaurantlist[i].getName()) {
                    restaurantlist[i] = null;
                    compactArray(restaurantlist, i);
                    count--;
                }
            }
            return true;
        }
        return false;
    }
    public Restaurant[] getRestaurantlist() {
        return restaurantlist;
    }  
    
   private boolean compactArray(Restaurant r[], int j) {
        for (int i = j; i < restaurantlist.length; i++) {
            if (i == restaurantlist.length - 1) {
                return false;
            }
            restaurantlist[i] = restaurantlist[i + 1];
        }
        return true;
    }
  @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Rest List");
        str.append("\n---------------------------------------\n");
        for (int i = 0; i < this.count; i++) {
            str.append(restaurantlist[i].getName() + " : " + restaurantlist[i].getPrice() + "\n");
        }
        return str.toString();
    }
}
