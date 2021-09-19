import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radius;
        final double pi = 3.14;
        System.out.println("enter the radius of circle");
        radius= sc.nextDouble();
        System.out.println("the area of circle is "+ pi*radius*radius);
        System.out.println("the perimeter of circle is "+ 2*pi*radius);
        
    }
}
