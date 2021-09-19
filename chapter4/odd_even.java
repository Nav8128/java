package chapter4;
import java.util.Scanner;
public class odd_even {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.println("enetr thwe number upto which you want to find odd even");
      num = sc.nextInt();
      for(int i=1; i<=num; i++)
      {
          if(i % 2==0)
          {
              System.out.println(i + " is even");

          }
          else
          {
              System.out.println(i + " is odd");
          }
      }
  }  
}
