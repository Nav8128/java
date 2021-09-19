public class agent {
   

    public static void main(String[] args) {
        String codename, confirm;
        boolean sit = false;
        System.out.println("hello, agent please enter a code name");
        System.out.println("codename should contain atleast 6 letters and should always start with word 'agent'  and should always ends with 'X'");
        System.out.println("please eneter a codename");
        codename = EasyScanner.nextString();
        sit = situation(codename);
       while(sit == false)
       {
        System.out.println("invalid codename");
           codename = EasyScanner.nextString();
           sit = situation(codename);
       }
         
       System.out.println("please confirm your codename");
       confirm = EasyScanner.nextString();
       if(codename.equals(confirm))
       {
           System.out.println("CODENAME CONFIRMED");
           
       }
       else
       {
           System.out.println("CODE NAME MIS-MATCHED");
       }
   
   

    }
    static boolean situation(String codename )
    {
        boolean sit = false;
        
        char last = codename.charAt(codename.length()-1);
        if((last == 'x' || last == 'X')  &&  codename.startsWith("agent") && codename.length() >=5)
       
            {
               sit = true;
            }
            return sit; 
            
    }

}
