import chapter8.incubator.EasyScanner;

public class circularapplication {
    
    public static void main(String[] args) {
        double radius = 0;
        char choice;
        CircularShape cr = new CircularShape(radius);
        do{
        System.out.println("OPTION 1 = ENTER RADIUS");
        System.out.println("OPTION 2 = DISPLAY RADIUS");
        System.out.println("OPTION 3 = CALCULATE AREA");
        System.out.println("OPTION 4 = CALCULATE CIRCUMFERENCE");
        System.out.println("OPTION 5 = EXIT");
        System.out.println("please enter your choice");
        choice = EasyScanner.nextChar();

        switch(choice)
        {
            case '1' : option1(cr);
            break;
            case '2' : option2(cr);
            break;
            case '3' : option3(cr);
            break;
            case '4' : option4(cr);
            break;
            case '5' : System.out.println("thank you");
            break;
            default : System.out.println("enter a valid option");
        }
    }
    while(choice != '5');
    }

    
    public static void option1(CircularShape crIn)
    {
          System.out.println("enter the radius of circle");
          double radius = EasyScanner.nextDouble();
          crIn.seRadius(radius);
    }


    public static void option2(CircularShape crIn)
    {
    
         System.out.println("RADIUS = " +  crIn.getRadius());
    }
    

    public static void option3(CircularShape crIn)
    {
         System.out.println("AREA = " + crIn.calculateArea());
    }

    public static void option4(CircularShape crIn)
    {
         System.out.println("CIRCUMFERENCE = " + crIn.calculateCircumference());
    }

}

