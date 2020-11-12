package javaapplication2;

import java.util.Scanner;


public class FindRestaurant {

    private Restaurant restaurantlist[];
    private int count = 0;
    private final int[] price = {50,149,200,150,150,100,250,350,450,500,499,100,359,359,599,259,380,179,399,399,699};
    
    public FindRestaurant() {
        this.restaurantlist = new Restaurant[20]; //default
        for(int i=0;i<RestaurantName.values().length;i++){
           restaurantlist[i] = new Restaurant(RestaurantName.values()[i],price[i]);
           count++;
        }
    }
    
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
 
   public  void Scan() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        //System.out.println(fr);
        System.out.println("Your Restaurant : " + PickRestaurant(num));
        //System.out.println(fr.PickRestaurant(170));
    }
    public void list(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int number = scr.nextInt();
        System.out.println(listRestaurant(number));
    }
     public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("M e n u :");
        System.out.println("--------------------------");
        System.out.println("1) List of Restaurant");
        System.out.println("2) Random Restaurant");
        System.out.println("3) List on Budget");
        System.out.println("--------------------------");
        System.out.println("0) Exit\n");
        System.out.print("Select your choice: ");
        int selected = sc.nextInt();
        sc.nextLine();
        return selected;
    }
     public void Case(){
         while(true){
            int a = menu();
        switch(a) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println(toString());
                break;
            case 2:
                Scan();
                break;
            case 3: 
                list();
                break;
             default:
                System.out.println("Not found");
                break;
        }
        if(a == 0) break;
        }
       
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
