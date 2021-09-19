package chapter5;
import java.util.Scanner;
public class money {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double amount=0, tax=0, converted;
    int choice;
   do
   {
     System.out.println("[1] ENETER THE AMOUNT OF DEPOSIT");
     System.out.println("[2] ENTER THE TAX");
     System.out.println("[3] DISPLAY THE AMOUNT AFTER A YEAR");
     System.out.println("[4] EXIT");
     System.out.println("enter your choice");
     choice  = sc.nextInt();
     switch(choice)
     {
         case 1:  amount = sum();
         break;
         
         case 2:  tax = tax();
         break;

         case 3:  converted = conversion(amount, tax);
                  display(converted);
                  System.out.println("DO YOU WANT TO CONVERT ANOTHER ANOUNT");
         break;

         case 4: System.out.println("THANK YOU!!");
         break;

         default : System.out.println("enter valid option");
     }
    }
    while(choice != 4);

}    


static double sum()
{   
    Scanner sc = new Scanner(System.in);
    double amount;
    System.out.println("enter the amount you want deposit");
    amount = sc.nextDouble();
    return amount;
}


static double tax()
{
    Scanner sc = new Scanner(System.in);
    double tax;
    System.out.println("enter the rate of tax");
    tax = sc.nextDouble();
    return tax;
}


static double conversion(double Inamount, double Intax )
{
    return Inamount + (Inamount * Intax / 100);
}


static void display(double Inconverted)
{
    System.out.println("the amount after a year will be " + Inconverted);
}
}
