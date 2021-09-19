package chapter5;
import java.util.Scanner;
public class rectangle {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double length, width;
     System.out.println("enter the lenght of rectangle");
     length = sc.nextDouble();
     System.out.println("enter the width of rectangle");
     width = sc.nextDouble();
     System.out.println("the area is "+ area(length, width));
     System.out.println("the perimeter is "+ perimeter(length, width));

 }   
 static double area(double Inlenght, double Inwidht)
 {
     return  Inlenght * Inwidht;
 }

 static double perimeter(double Inlength, double Inwidth)
 {
     return 2*(Inlength+Inwidth);
 }
}
