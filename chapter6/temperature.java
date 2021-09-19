package chapter6;

import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        double[][] temperature;      
    temperature = enter();
   display(temperature);


    }
    static double[][] enter()
    {
        double[][] temperatureIn = new double[4][7];
                Scanner sc = new Scanner(System.in);
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<7; j++)
            {
                System.out.println("enter the temperature for day " + (j+1) + "of week " + (i+1));
                temperatureIn[i][j] = sc.nextDouble();
            }
        }
        return temperatureIn;
    }
    static void display(double[][] temperatureIn)
    {
        for(int i = 0; i<4; i++)
            {
                for(int j = 0; j<7; j++)
                {
                    System.out.println("temperature for day " + (j+1) + " of week " + (i+1) + " is " + temperatureIn[i][j]);
                }
            }
    }
    static void wasHot(double[][] temperatureIn)
    {
        
    }
}

    