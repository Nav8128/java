

public class incubatorTest {
    public static void main(String[] args) {
      char choice;
       incubator st = new incubator();
       do
       {

       
       System.out.println("OPTION 1 = INCREASE TEMPERATURE");
       System.out.println("OPTION 2 = DECREASE TAMPERATURE");
       System.out.println("OPTION 3 = DISPLAY TEMPERTAURE");
       System.out.println("OPTION 4 = EXIT");
       System.out.println("enter your choice");
        choice = EasyScanner.nextChar();


       switch(choice)
       {
                    case '1' : increasetemp(st);
                    break;
                    case '2' : decraesetemp(st);
                    break;
                    case '3' :System.out.println("TEMPERTAURE = " +  st.getTemperature());
                    break;
                    case '4' : System.out.println("byee");
                    break;
                    default : System.out.println("enter a valid option ");
       }
    }
   
     while(choice != '4');

    }

     public static void  increasetemp(incubator st)
     {  if(st.getTemperature() < st.max )
        {
        st.increaseTemperature();
        System.out.println("TEMPERATURE = " + st.getTemperature());
     }
     else 
     {
         System.out.println("ALARM TEMPERTURE HAS REACHED ITS MAXIMUM LIMITS  ");
     }
    }



    public static void  decraesetemp(incubator st)
    {  if(st.getTemperature() > st.min )
       {
       st.decreaseTemperature();
       System.out.println("TEMPERATURE = " + st.getTemperature());
    }
    else 
    {
        System.out.println("ALARM TEMPERTURE HAS REACHED ITS MINIMUM LIMITS  ");
    }
   }





}
