package chapter4;

import java.util.Scanner;
public class table {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    char choice;
   do
   {
    System.out.println("enetr the no. ehose multiplication table you want");
    num = sc.nextInt();
    while(num<=2){
        num= sc.nextInt();
    }
   
    
    
    for(int i = 1; i<=10; i++)
    {
        System.out.println(num + " * " + i +  " = "+ (num*i));
    }
     System.out.println("enter Y to eneter another number or n to quit");
     choice = sc.next().charAt(0);
}
while(choice =='y' || choice == 'Y');
    
}
    
}
