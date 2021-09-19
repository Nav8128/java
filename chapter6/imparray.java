package chapter6;
import java.util.Scanner;


public class imparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] somearray;
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        somearray = new int[size];
        
        enter(somearray);
       System.out.println("hey " + max(somearray));
       sum(somearray);
       search(somearray);

    }
        static void enter(int[] somearrayIn)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value");
            for(int i = 0; i<somearrayIn.length; i++)
            {

            somearrayIn[i] = sc.nextInt();
            
            }
            
        }



    static int max (int [] somearrayIn)
    { 
        int max = somearrayIn[0];
        for(int i = 1; i<somearrayIn.length; i++)
        {
            if(somearrayIn[i] > max)
            {
                max = somearrayIn[i];
            }
        }
       return max; 
    }
    
    static void sum(int [] somearrayIn)
    {
        int sum = 0;
        for(int i = 0; i<somearrayIn.length; i++)
        {
            sum = sum + somearrayIn[i];
        }
        System.out.println("the sum of array is "+ sum);
    }
    static void search(int [] somearrayIn)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number you want to search");
        num = sc.nextInt();
        for(int i = 0; i<somearrayIn.length; i++)
        {
            if(num == somearrayIn[i])
            {
                System.out.println("YES, the number you entered is found in the array");
            }
            
        }
             
    }
}
