public class bank {
    public static void main(String[] args) {
         
        String accountName, accountNo, confirmNo;
        BankAccount mybk;
        double amount;
        System.out.println("enter the accouint number and name to craete an account");
        System.out.print("ACCOUNT NUMBER : ");
        accountNo = EasyScanner.nextString();
        System.out.println();
        System.out.println("ACCOUNT  NAME: ");
        accountName = EasyScanner.nextString();
        mybk = new BankAccount(accountNo, accountName);
        System.out.println("enter the amount you want to deposit in your account");
        amount = EasyScanner.nextDouble();
        System.out.println("please confirm your account number to depoisit your amount in your account");
        confirmNo = EasyScanner.nextString();
        if(accountNo.equals(confirmNo))
        {
            mybk.deposit(amount);
        }
        else {
            System.out.println("your account number des not exist");
        }
        System.out.println(mybk.getAccountNumber() + mybk.getAccountName() + mybk.getBalance() );



        
    }
}
