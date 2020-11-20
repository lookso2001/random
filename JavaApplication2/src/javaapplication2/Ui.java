package javaapplication2;
import java.util.Scanner;
public class Ui {
    
    FindRestaurant fr = new FindRestaurant();
    
       public  void RandomRestaurant() {//2
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        //System.out.println(fr);
        System.out.println("Your Restaurant : " + fr.PickRestaurant(num));
        //System.out.println(fr.PickRestaurant(170));
    }
    public void Budget(){//3
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        System.out.println(fr.listBudget(num));
    }
//     public void Add(){//4  
//        Scanner scr = new Scanner(System.in);    
//        System.out.print("Restaurant name :");
//        String Name = scr.nextLine();     
//        System.out.print("min price :");
//        int num = scr.nextInt();
//               
//    }
     public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU :");
        System.out.println("--------------------------");
        System.out.println("1) List of Restaurant");
        System.out.println("2) Random Restaurant");
        System.out.println("3) List on Budget");
        System.out.println("4) Add Restaurant");
        System.out.println("5) Remove Restaurant");
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
                fr.AddPrice();
                break;
            case 5:
              //  remove();
                break;
             default:
                System.out.println("Not found");
                break;
        }
         if(a == 0) break;
         }
    }
}
