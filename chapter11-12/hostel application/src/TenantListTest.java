public class TenantListTest {
    public static void main(String[] args) {
        TenantList t= new TenantList(2);
       option1(t);
       option1(t);
       option1(t);
       option2(t);
       option2(t);
       option3(t);

        
    }

    public static void option1(TenantList t)
    {
        System.out.println("enter the name of tenant");
        String name  = EasyScanner.nextString();
        System.out.println("enter the room number");
        int room = EasyScanner.nextInt();
        boolean done=  t.isEmpty();
        if(done)
        {
        Tenant demo = new Tenant(name, room);
        t.addTenant(demo);
        System.out.println("successfull");
        }
        else
    {
        System.out.println("rooms are full");
    }

    }



    public static void option2(TenantList tIn)
    {
        System.out.println("enter the room number rom ehich you want to remove tenant");
        int room = EasyScanner.nextInt();
       Tenant done = tIn.Search(room);
        if(done != null)
        {   tIn.removeTenant(room);
            System.out.println("tenant removed succesfully");
        }
        else
        {
            System.out.println("enter a valid room number");
        }

    }




    public static void option3(TenantList t)
    {
         System.out.println("enter the position of which yopu want tenant details");
         int pos = EasyScanner.nextInt();
         
         Tenant demo = t.getTenant(pos);
         if(demo != null && pos <= t.getTotal() )
         {
             System.out.println(demo.toString());
            
         }

         else{
             System.out.println("enter a valid position");
         }
    }
}
