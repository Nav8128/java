

public class incubator 
{
    private int temperature;
    public int max = 10;
    public int min  = -10;


    public incubator()
    {
        temperature = 5;
    }


    public int getTemperature()
    {
        return temperature;
    }


    public void increaseTemperature()
    {
       
           temperature =  temperature + 1;
    }

    public void decreaseTemperature()
    {
       
           temperature =  temperature - 1;
           
    }

}
