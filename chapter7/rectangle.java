

public class rectangle {
    public static void main(String[] args) {
       EasyScanner easy = new EasyScanner();
        double length, width, perimeter, area;
        Oblong myoblong;
        System.out.println("enter the lenght of rectanglr");
        length = EasyScanner.nextDouble();
        System.out.println("enetr the height of rectangle");
        width = EasyScanner.nextDouble();
        
        myoblong = new Oblong(length, width);
        myoblong.setLength(length);
        myoblong.setHeight(width);
        myoblong.setLength(15);
        myoblong.setHeight(20);
        System.out.println("lenght = " + myoblong.getLength());
        System.out.println("width = " + myoblong.getHeight());
        System.out.println("area = " + myoblong.calculateArea());
        System.out.println("perimeter = " + myoblong.calculatePerimeter());


    }
}
