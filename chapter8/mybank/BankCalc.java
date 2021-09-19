

import java.util.ArrayList;

public class BankCalc {
    ArrayList<BankInputs> mylist = new ArrayList<>();



    private int Search(String accountnumberIn)
    {
        
        for(int i = 0; i <= mylist.size() -1; i++)
        {
            BankInputs tempAccount = mylist.get(i);
            String tempaccountnumber = tempAccount.getAccountnumber();
            if(tempaccountnumber.equals(accountnumberIn))
            {
                return i;
            }
       
        }
        return -999;

    }


    public int getTotal()
    {
        return mylist.size();
    }


    public BankInputs getItem(String accountnumberIn)
    {
        int index = Search(accountnumberIn);
        if(index != -999)
        {
            return mylist.get(index);
        }
        return null;
    }


    public boolean addAccount(String accountnumberIn, String accountnameIn)
    {
        int index  = Search(accountnumberIn);
        if(index == -999)
        {
            mylist.add(new BankInputs(accountnumberIn, accountnameIn));
            return true;
        }
        return false;
    }


    public boolean depositMoney(String accountnumberIn, double amountIn)
    {
        int index  = Search(accountnumberIn);
        if(index != -999)
        {
            BankInputs tempAccount = mylist.get(index);
            tempAccount.deposit(amountIn);
            return true;
        }
        return false;
    }


    public boolean withdraw(String accountnumberIn, double amountIn)
    {
        int index  = Search(accountnumberIn);
        if(index != -999)
        {
            BankInputs tempAccount = mylist.get(index);
            tempAccount.withdraw(amountIn);
            return true;
        }
        return false;
    }


    public boolean removeAccount(String accountnumberIn)
    {
        int index  = Search(accountnumberIn);
        if(index != -999)
        {
            BankInputs tempAccount = mylist.remove(index);
            return true;

        }  
        return false;
    }
}
