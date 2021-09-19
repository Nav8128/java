package chapter4;
import java.util.Scanner;


public class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gums = 0, chocolates = 0, popcorn = 0, juice = 0, choice;
        do
        {
        System.out.println("[1] GET GUMS");
        System.out.println("[2] GET CHOCOLATES");
        System.out.println("[3] GET POPCORN");
        System.out.println("[4] GET JIUCE");
        System.out.println("[5] DISPLAY TOTAL SOLD SO FAR");
        System.out.println("[6] QUIT");
        System.out.println("please enter your choice");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("here's your gum");
                    gums++;
                    break;
            case 2: System.out.println("here's your chocolates");
                    chocolates++;
                    break;
            case 3: System.out.println("here's your popcorn");
                    popcorn++;
                    break;
            case 4: System.out.println("here's your juice");
                    juice++;
                    break;
            case 5: System.out.println(gums + " items of gums sold so far");
                    System.out.println(chocolates + " items of chocolates sold so far");
                    System.out.println(popcorn + " items of popcorn sold so far");
                    System.out.println(juice + " items of juice sold so far");
                    break;
            case 6: System.out.println("thank you");
                    break;
            default : System.out.println("enter a valid option");                                            
        }

    }
    while(choice != 6);
}
}