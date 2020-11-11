package javaapplication2;
import javaapplication2.Restaurant;
import javaapplication2.FindRestaurant;
import java.util.Arrays;
import java.util.Scanner;
public class Run {
      static FindRestaurant fr = new FindRestaurant();
    public static int menu() {
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
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("FiveStart Chicken", 50);
        Restaurant r2 = new Restaurant("KFC", 150);
        Restaurant r3 = new Restaurant("Statafe'", 200);
        Restaurant r4 = new Restaurant("Yayoi", 150);
        Restaurant r5 = new Restaurant("MacDonald", 150);
        Restaurant r6 = new Restaurant("Chester", 100);
        Restaurant r7 = new Restaurant("Sizzler", 250); 
        Restaurant r8 = new Restaurant("Bonchon", 350);
        Restaurant r9 = new Restaurant("Bar-B-Q", 450);
        Restaurant r10 = new Restaurant("MK", 500);
        //FindRestaurant fr = new FindRestaurant();
        fr.addRestaurant(r10);
        fr.addRestaurant(r9);
        fr.addRestaurant(r8);
        fr.addRestaurant(r7);
        fr.addRestaurant(r6);
        fr.addRestaurant(r5);
        fr.addRestaurant(r4);
        fr.addRestaurant(r3);
        fr.addRestaurant(r2);
        fr.addRestaurant(r1);
        //System.out.println(fr);
        //fr.removeRestaurant(r1.getName());
        //fr.removeRestaurant(r4.getName());
        int a = menu();
        //System.out.println(a);
        switch(a) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println(fr);
                break;
            case 2:
                Scan();
                break;
            case 3: 
                list();
                break;
        }
    }
    public static void Scan() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int num = scr.nextInt();
        //System.out.println(fr);
        System.out.println("Your Restaurant : " + fr.PickRestaurant(num));
        //System.out.println(fr.PickRestaurant(170));
    }
    public static void list(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Budget : ");
        int number = scr.nextInt();
        System.out.println(fr.listRestaurant(number));
        
    }
}
