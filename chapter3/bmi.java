package chapter3;
 import java.util.*;
 
public class bmi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("enter the weight in killos");
        weight=sc.nextDouble();
        System.out.println("enter the height in meters");
        height= sc.nextDouble();
        bmi= weight/(height*height);
        System.out.println("the bmi of person is given as "+ bmi);

        if(bmi<18.5)
        {
            System.out.println("you are underweight");
        }
        else if(bmi>=18.5&& bmi <24.9)
        {
            System.out.println("you are healthy");
        }
        else
        {
            System.out.println("you are overweight");
        }
    }
    
}

