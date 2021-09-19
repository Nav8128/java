package chapter4;
import java.util.Scanner;
public class starmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        char choice;
        do
        {
        System.out.println("enter the num of rows you want");
        rows = sc.nextInt();
        while (rows<2 || rows > 20)
        {
            System.out.println("enetr a valid number of rows");
            rows = sc.nextInt();
        }
       
        for(int i =1; i<=rows; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
        
            System.out.println("");
        }
            System.out.println("enter Y to eneter another number or n to quit");
     choice = sc.next().charAt(0);
        
    }
    while(choice== 'y' || choice =='Y');
    }
}
