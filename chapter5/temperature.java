package chapter5;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
        System.out.println("[1] C TO F");
        System.out.println("[2] F TO C");
        System.out.println("[3] EXIT");
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: CtoF();
            System.out.println("doyou want to convert another temperature");
            break;

            case 2 : FtoC();
            System.out.println("doyou want to convert another temperature");
            break;

            case 3: System.out.println("thank you!!");
            break;

            default: System.out.println("enter a valid option");
        }
    }
    while(choice !=3);
    }
    static void CtoF()
    {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.println("enter the temperature in celcius");
        c = sc.nextDouble();
        while(c <= -273)
        {
            System.out.println("you cannot enter a temperature beelow absolute zero that is -273C");
            System.out.println("enter the temperature again");
            c = sc.nextDouble();
        }
        f = ((9*c)/5) + 32;
        System.out.println("After conversion the temperature in fehrenite is " + f);
        
    }


    static void FtoC()
    {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.println("enter the temperature in ferhenite");
        f = sc.nextDouble();
        while(f <= -459.67)
        {
            
            System.out.println("you cannot enter a temperature beelow absolute zero that is -459.67F");
            System.out.println("enter the temperature again");
            f = sc.nextDouble();
        }
        c = 5*(f-32)/9;
        System.out.println("After conversion the temperature in celcius is " + c);
        

    }
}
