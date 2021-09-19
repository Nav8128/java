import java.util.Scanner;
public class reactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, length ,area, perimeter;
        System.out.println("enter the lenght of rectangle");
        length=sc.nextDouble();
        System.out.println("enter the height of rectangle");
        height= sc.nextDouble();
        area= height*length;
        perimeter=2*(length+height);
        System.out.println("the area and perimeter of rectanglr are " + area +" "+ perimeter);
    }
    
}
