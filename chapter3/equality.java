 import java.util.*;
public class equality {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a,b;
    System.out.println("enter the first number");
    a = sc.nextInt();
    System.out.println("enetr the second nyumber");
    b = sc.nextInt();
    if(a==b)
    {
        System.out.println("the numbers are equal");

    }
    else if(a>b)
    {
        System.out.println("the numbers are not equal");
        System.out.println("the first number entered that is "+ a +" is bigger than the second number "+b);
    }
    else if(a<b)
    {
        System.out.println("the numbers are not equal");
        System.out.println("the second number entered that is "+ b +" is bigger than the first number "+a);
    }
    else
    {
        System.out.println("enter a valid number");

    }

}
    
}           