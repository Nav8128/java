import java.util.Scanner;

public class find_cost {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double amount, tax;
    System.out.println("enter the amont of product");
    amount=sc.nextDouble();
    System.out.println("enter the tax");
    tax=sc.nextDouble();
    amount=amount +(1+tax/100);
    System.out.println("the maount after adding the tax is "+ amount);

}
    
}