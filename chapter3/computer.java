package chapter3;
import java.util.Scanner;

public class computer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Screenchoice, additionalchoice;
        double cost = 375.99;
        System.out.println("the basic cost of computer is $375.99");
        System.out.println(" you have two options for the moniter size. Please choose from the below options");
        System.out.println("1 = 38 cm which costs $75.99");
        System.out.println("2 = 43cm which costs $99.99 ");
        System.out.println("please enter 1 or 2");
        Screenchoice= sc.nextInt();
        if (Screenchoice == 1)
        {
            cost= cost+75.99;
            System.out.println("your total amount is $451.98");
        }
        else if(Screenchoice == 2)
        {
            cost=cost+99.99;
            System.out.println("your total amount is $475.99");
        }
        else 
        {
            System.out.println("enetr a valid option");
        }
        System.out.println("here are some of the other products you would love");
        System.out.println("1 = antivirus software which costs $65.99 ");
        System.out.println("2 = printer which costs $125");
        System.out.println("press 1 or 2 if you want to buy from the above mentioned products or else press any other key to exit");
        additionalchoice = sc.nextInt();
        if(additionalchoice==1)
        {
            cost = cost+65.99;
            System.out.println("");
        }
        else if(additionalchoice==2)
        {
            cost = cost+125;
            System.out.println("");
            
        }
        else 
        {
            System.out.println("");
        }
        System.out.println("your final bill is $"+cost);
        System.out.println("thank you for shopping with us.");
        
    }
}
