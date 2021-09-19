public class fact {

    public static int factloop(int n)
    {
        int total  = 1;
        for(int i  = 1; i<=n; i++  )
        {
             total = total*i;
        }
        return total;
    }



    public static int factn(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else 
        {
            return factn(n-1) *n;
        }
    }
    public static void main(String[] args) {
        int fact;
        fact = factn(5);
        System.out.println( "fact: " + fact);
        System.out.println(factn(0));

        System.out.println(factloop(0));
    }
}
