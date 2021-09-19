package chapter3;
import java.util.Scanner;
public class exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("please enter your marks");
        marks = sc.nextInt();
        if(marks < 40 && marks>=0)
        {
            System.out.println("sorry you have failed the exam");
        }
        else if(marks>40 && marks<=100)
        {
            System.out.println("yopu have passed the exam");
            if(marks>=70)
            {
                System.out.println("you have paaseds the exam with extinction");
            }
        }
       
        else
        {
            System.out.println("eneter a valid marks");
        }
        System.out.println("good luck with your other exams"); 
    }
}
