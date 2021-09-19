
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char accountType;
        double amount;
        System.out.println("Welcome to our bank. Here are the types of accounts we have with the interest rates of those acoounts");
        System.out.println("TYPE A with interest rate of 1.5");
        System.out.println("TYPE B with interest rate of 2");
        System.out.println("TYPE C with interest rate of 1.5");
        System.out.println("TYPE X with interest rate of 5");
        System.out.println("please choose the type of account you want");
        accountType = sc.next().charAt(0);
        System.out.println("enetr the amount you want to deposit");
        amount = sc.nextDouble();
        
        switch (accountType)
        {
            case 'a': case 'A': case 'c': case 'C': if(amount>=250)
                          
                         {
                          amount = amount + (amount*1.5)/100;
                          System.out.println("your amount after one year would be " + amount);
                         }
                         else 
                         {
                             System.out.println(" SORRY, the minimum amount for this account is 250");
                         }
                          break;       
             
            case 'b': case 'B': if (amount>=1000)
                          {
                          amount = amount + (amount*2)/100;
                          System.out.println("your amount after one year would be " + amount);
                          }
                          else 
                          {
                              System.out.println(" SORRY, the minimum amount for this account is 1000");
                          }
                          break;  
                          
            case 'X': case 'x': if (amount>=5000) 
                         {
                          amount = amount + (amount*5)/100;
                          System.out.println("your amount after one year would be " + amount);
                         }
                         else 
                         {
                             System.out.println(" SORRY, the minimum amount for this account is 5000");
                         }
                          break;                     

            default : System.out.println("enter a vallid option");              
        }
    }
}
