

import java.util.Scanner;

import chapter8.rooms.EasyScanner;
public class BankApplication {
    public static void main(String[] args) {
        BankCalc mybank = new BankCalc();
    char choice;
    do
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("OPTION 1 = CREATE AN ACCOUNT ");
        System.out.println("OPTION 2 = DELETE AN ACCOUNT ");
        System.out.println("OPTION 3 = DEPOSIT MONEY");
        System.out.println("OPTION 4 = WITHDRAW MONEY");
        System.out.println("OPTION 5 = CHECK ACCOUNT DETAILS");
        System.out.println("OPTION 6 = EXIT ");
        System.out.println();
        System.out.println("please enter your choice");
        choice =  EasyScanner.nextChar();

        switch(choice)
        {
                       case '1' : option1(mybank);
                       break;

                       case '2' : option2(mybank);
                       break;
                       
                       case '3' : option3(mybank);
                       break;

                       case '4' : option4(mybank);
                       break;

                       case '5' : option5(mybank);
                       break;

                       case '6' : System.out.println("thank you ");
                       break;
          
        }
    }
    while(choice!= '6');
   
    }
    
      public static void option1(BankCalc mybankIn)
      {   String number, name;
          System.out.println("enter the account number");
          number = EasyScanner.nextString();
          System.out.println("enter the name of the acoount holder");
          name = EasyScanner.nextString();
          boolean done = mybankIn.addAccount(number,name);
          if(done)
          {
              System.out.println("account added");
          }
          else{
              System.out.println("account number already exist");
          }
          
      }


      public static void option2(BankCalc mybankIn)
      {
          System.out.println("enter the account number you want to remove");
          String number = EasyScanner.nextString();
          boolean done = mybankIn.removeAccount(number);
          if(done)
          {
              System.out.println("account removed successfully");

          }
          else
          {
              System.out.println("account number does not exist");
          }
      }



      public static void option3(BankCalc mybankIn)
      {
          System.out.println("enter the account number in which you want to make deposit");
          String number = EasyScanner.nextString();

          System.out.println("enter the amount you want to deposit");
          double amount = EasyScanner.nextDouble();
         boolean done =  mybankIn.depositMoney(number, amount);
         if(done)
         {
             System.out.println("de[osit done succesfully");

         }
         else
         {
             System.out.println("you entered a wrong accountnumber");
         }
      }

      public static void option4(BankCalc mybankIn)
      {  
        System.out.println("enter the account number from which you want to make withdrawlt");
        String number = EasyScanner.nextString();
        BankInputs myinputs = mybankIn.getItem(number);
        System.out.println("enter the amount you want to withdraw");
        double amount = EasyScanner.nextDouble();
        boolean done =  mybankIn.withdraw(number, amount);
        if(done)
        {
            System.out.println("withdrawl successfull");
            System.out.println("remaining balance = " + myinputs.getBalance());
        }
        else
        {
            System.out.println("insufficient funds");
        }
      }


      
      public static void option5(BankCalc mybankIn)
      {
        System.out.println("enter the account number from which you want to make withdrawlt");
        String number = EasyScanner.nextString();
        BankInputs myinputs = mybankIn.getItem(number);
        System.out.println("account name = " + myinputs.getAccountname());
        System.out.println("account name = " + myinputs.getAccountnumber());
        System.out.println("account name = " + myinputs.getBalance());

      }
}
