import java.util.Scanner;


public class circle{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radius=0, area, perimeter;
    int choice;
    do 
    {
    System.out.println("[1] SET RADIUS");
    System.out.println("[2] DISPLAY RADIUS");
    System.out.println("[3] DISPLAY AREA");
    System.out.println("[4] DISPLAY PERIMETER");
    System.out.println("[5] QUIT");
    System.out.println("enter your choice");
    choice = sc.nextInt();
    
    
    switch(choice)
    {
        case 1: System.out.println("enter the radius");
                  radius = sc.nextDouble();
                  break;
        case 2: System.out.println("The radius last enetred by you was " + radius);
                  break;
        case 3: area = 3.14*radius*radius;
                  System.out.println("the area of thr circle is " + area); 
                  System.out.println("");
                  break;
        case 4: perimeter = 2*3.14*radius;
                  System.out.println("The perimeter of circle is " + perimeter);
                  System.out.println(""); 
                  break;
        case 5: System.out.println("THANK YOU");
                  break;
        default : System.out.println("enetr a valid option");                                               
    }

    }
    while(choice !=5);
}
}