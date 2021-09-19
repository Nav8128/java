public class stringcomp {
    public static void main(String[] args) {
        String st1, st2;
        System.out.println("eneter the first string");
        st1 = EasyScanner.nextString();
        System.out.println("eneter the second string");
        st2 = EasyScanner.nextString();
        comp1(st1, st2);
        System.out.println(comp1(st1, st2));
        System.out.println("without upper lower case worries " + compWithoutCase(st1,st2));
        System.out.println("with trim " + compWithTrim(st1, st2) );

    }
    static boolean comp1( String st1In, String st2In)
    {   
        boolean result = false;
        if(st1In.equals(st2In))
        {
            result = true;
        }
        return result;
        
    }


    static boolean compWithoutCase( String st1In, String st2In)
    {   
        boolean result = false;
        st1In = st1In.toLowerCase();
        st2In = st2In.toLowerCase();
        if(st1In.equals(st2In))
        {
            result = true;
        }
        return result;
        
    }
    static boolean compWithTrim( String st1In, String st2In)
    {   
        boolean result = false;
        st1In = st1In.trim();
        st2In = st2In.trim();
        if(st1In.equals(st2In))
        {
            result = true;
        }
        return result;
        
    }
}
