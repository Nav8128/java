



public class BankInputs {
    private String Accountnumber;
    private String Accountname;
    private double balance = 0;



    public BankInputs(String AccountnumberIn, String AccountnameIn)
    {
      Accountnumber = AccountnumberIn;
      Accountname = AccountnameIn;
    }

    public String getAccountnumber()
    {
        return Accountnumber;
    }


    public String getAccountname()
    {
        return Accountname;

    }



    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amountIn)
    {
        balance = balance+ amountIn;
    }
    

    public boolean withdraw(double amountIn)
    {
        if(balance>= amountIn)
        {
            balance = balance - amountIn;
            return true;
        }
         return false;
        


        
    }
    
}
