

public class oblong1 {
    protected double length = 0;
    protected double height = 0;
   


    public oblong1(double lenghtIn, double heightIn)
    {
        length  = lenghtIn;
        height  = heightIn;
       

    }

   


    public double getLenght()
    {
        return length;
    }


    public double getHeight()
    {
        return height;
    }


    public void setLenght(double lengthIn)
    {
        length = lengthIn;
    }


    public void setHeight(double heightIn)
    {
        height = heightIn;
    }



    public double calculateArea()
    {
        return length * height;
    }



    public double calculatePerimeter()
    {
        return 2*(length * height);
    }
}
