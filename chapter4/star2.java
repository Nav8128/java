package chapter4;

public class star2 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++)
        {
            if(i==3 || i==4)
            {
                for(int j= 1; j<=9; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else
            {
                for(int j= 1; j<=3; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
           
            
        }
    }
}
