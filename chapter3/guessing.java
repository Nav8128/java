import java.util.Scanner;
public class guessing {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    System.out.println("enter the first nuumber");
    a = sc.nextInt();
    System.out.println("enetr the second number");
    b = sc.nextInt();
    System.out.println("guess the sum of the two numbers that you have enetered");
    c = sc.nextInt();
    if(a+b==c)
    {  
        System.out.println("congrates your guess was correct");

    }
    else{
        System.out.println("sorry your guess was not correct");
        System.out.println("and the correct answer is "+ (a+b));
    }


}    
}
