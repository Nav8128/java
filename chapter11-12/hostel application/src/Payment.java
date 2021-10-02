public class Payment {
    
    private String month;
    private double amount;



    public  Payment (String monthIn, double amountIn){
     month = monthIn;
     amount  = amountIn;
    }


    public String getMonth()
    {
        return month;
    }


    public double getAmount()
    {
        return amount;
    }


    @Override
    public String toString()
    {
        return (month + " : " + amount);
    }
}
