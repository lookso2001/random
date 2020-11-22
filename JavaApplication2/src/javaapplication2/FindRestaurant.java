package javaapplication2;

import java.util.Scanner;

public class FindRestaurant {

    private Restaurant restaurantlist[];
    private int count = 0;
    private int[] Price = {50,149,200,150,150,100,250,350,450,500,499,100,359,359,599,259,380,179,399,399};
    private String[] Rname = {"FiveStart Chicken","KFC","Statafe","Yayoi","MacDonald","Chester","Sizzler","Bonchon","BarB Q",
    "MK","Shabu Lab","Sushihiro","Ramen","Pizza","Berger king","Paper lunch","Katsuya","A&W","Hot Pot Buffet","Tossmor"};
    
    public FindRestaurant() {
        this.restaurantlist = new Restaurant[20];
        for(int i=0;i<this.Rname.length;i++){
           restaurantlist[i] = new Restaurant(Rname[i],Price[i]);
           count++;
        }
    }
    public String PickRestaurant(int Budget) { //2
        Restaurant rest[] = new Restaurant[this.count]; 
        StringBuilder str = new StringBuilder();
        int money = 0;
        for (int i = 0; i < this.count; i++) {
            if (this.restaurantlist[i].getPrice() <= Budget) {
                rest[money] = restaurantlist[i];
                money++;
            }
        }
        if (money != 0) { 
            int ran = (int) Math.floor(Math.random() * money);
            str.append(rest[ran].getName() + " " + rest[ran].getPrice());
        } else {
            str.append("Not Found");
        }
        return str.toString();
    } 
    public String listBudget(int Budget){ //3
          String str = "";
          str += "LIST :";
          str +="\n---------------------------------------\n";
          for (int i = 0; i < this.count; i++) {
            if (this.restaurantlist[i].getPrice() <= Budget) {
                str += (restaurantlist[i].getName() + " : " + restaurantlist[i].getPrice() + "\n"); 
            }
        }
        return str;    
    }
    public void AddRestaurent(){ //4
        Scanner scr = new Scanner(System.in); 
        System.out.print("Restaurant name :");
        String Name = scr.nextLine(); 
        String[] Newname  = new String[this.Rname.length+1];
        for(int i=0;i<this.Rname.length;i++){
        Newname[i] = Rname[i];       
      }
        Newname[Newname.length-1]= Name;
        this.Rname = Newname;
    }
    public void AddPrice(){//4
        Scanner scr = new Scanner(System.in);
       System.out.print("min price :");
       int num = scr.nextInt();
       int[] Newprice  = new int[this.Price.length+1];
        for(int i=0;i<this.Price.length;i++){
        Newprice[i] = Price[i];       
      }
        Newprice[Newprice.length - 1]= num;
        this.Price= Newprice;        
      }
//    public void NewArray() {
//        this.restaurantlist = new Restaurant[this.count];
//        for(int i=0;i<Newname.length;i++){
//           restaurantlist[i] = new Restaurant(Newname[i],Newprice[i]);
//           count++;
//        }
//    }
    
  @Override
    public String toString() {//1
        StringBuilder str = new StringBuilder();
        str.append("Rest List");
        str.append("\n---------------------------------------\n");
        for (int i = 0; i < Rname.length; i++) {
            str.append(Rname[i] + " : " +Price[i] + "\n");
        }
        return str.toString();
    }
}
