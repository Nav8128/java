package chapter5;
import java.util.Scanner;
public class pounds_to_killos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds;
        System.out.println("enter the wieght in pounds");
        pounds = sc.nextDouble();
        System.out.println("the weight in killos is "+ converter(pounds));

    }
    static double converter(double Inpounds)
{
double killos;
killos = Inpounds/2.2;
return killos;
}
}
