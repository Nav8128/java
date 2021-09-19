package chapter4;

import java.util.Scanner;
public class table2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
   do
   {
    System.out.println("enetr the no. ehose multiplication table you want");
    num = sc.nextInt();
   
}
  while(num<=2);
    
  for(int i = 1; i<=10; i++)
  {
      System.out.println(num + " * " + i +  " = "+ (num*i));
  }

}
    
}
