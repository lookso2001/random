package javaapplication2;
import java.util.Scanner;
public class Scann {
    
    public FindRestaurant fr = new FindRestaurant();
       public  void RandomRestaurant() {//2
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        System.out.println("Your Restaurant : " + fr.PickRestaurant(num));
    }
    public void Budget(){//3
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        System.out.println(fr.listBudget(num));
    }
     public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU :");
        System.out.println("--------------------------");
        System.out.println("1) List of Restaurant");
        System.out.println("2) Random Restaurant");
        System.out.println("3) List on Budget");
        System.out.println("4) Add Restaurant");
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
                System.out.println(fr.toString());
                break;
            case 2:
                RandomRestaurant();
                break;
            case 3: 
                Budget();
                break;
            case 4:
                fr.AddRestaurent();
                break;
             default:
                System.out.println("Not found");
                break;
        }
         if(a == 0) break;
         }
    }
}
