

public class CircularShape {
    
private double radius;


public CircularShape(double radiusIn)
{
   radius = radiusIn;
}

public void seRadius(double radiusIn)
{
   
    radius = radiusIn; 
}


public double getRadius()
{
    return radius;
}

public double calculateArea()
{
    return 3.14 * radius * radius;
}


public double calculateCircumference()
{
    return 2 * 3.14 * radius;
}
}
