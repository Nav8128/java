

public class extendedoblong extends oblong1 {
    private char symbol;

    public extendedoblong(double lenghtIn, double heightIn, char symbolIn)
    {
         super(lenghtIn, heightIn);
        symbol = symbolIn;
    }


    public void setSymbol(char symbolIn)
    {
        symbol = symbolIn;
    }


    public String draw()
    {
        String s = new String();
        int l,h;
         l =  (int) getLenght();
         h = (int) getHeight();
        for(int i = 1; i<= l; i++)
        {
              for(int j = 1; j<= h; j++)
              {
                  s = s + symbol;
              }
              s = s + '\n';
        }
        return s;
    }
    
}
