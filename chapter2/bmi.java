import java.util.*;
import java.math.*;
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

    }
    
}
