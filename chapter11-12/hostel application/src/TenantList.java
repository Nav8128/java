import java.util.ArrayList;

public class TenantList {
    private ArrayList<Tenant> tList = new ArrayList<>();
    public static int Max;

    
   public TenantList(int maxIn)
   {
       Max = maxIn;

   }
   
  /** search for tenant details in a room
  * 
  * @param RoomIn room number in which you want to serach for tenant details   
  * @return returns tenant details of rrom number entered
  */
   public Tenant Search(int RoomIn)
   {
       for(int i = 0; i<=tList.size()-1; i++)
       {
           Tenant tdemo = tList.get(i);
           if(RoomIn == tdemo.getRoom())
           {
               return tdemo;
           }
       }
       return null;
   }



    /**checks if a room is empty or not
     * 
     * @return  returns true if empty and vise versa
     */
   public boolean isEmpty()
   {

       return tList.isEmpty();
   }

/**
 * checks if rooms are full or not
 * @return returns true if full and vise versa
 */
public boolean isFull()
{
    if (tList.size() == Max)
    {
        return true;
    }

    return false;
}



/**add tenant to the list
 * 
 * @param t details of tenant
 * @return retuns true for successfull addition of tenant to list and false for failre
 */
public boolean addTenant(Tenant t)
{
   boolean full = isFull();
   if(!full)
   {
       tList.add(t);
       return true;
   }
   return false;
}



/**removes the tenant from list
 * 
 * @param roomIn room number from which you want to remove tenant
 * @return returns true for successfull removal and vise versa
 */
public boolean removeTenant(int roomIn)
{
    Tenant tdemo = Search(roomIn);
    if(roomIn == tdemo.getRoom())
    {
    tList.remove(tdemo);
    return true;
    }
    return false;
}


/**retuns a tenant details at particular position in list
 * 
 * @param positionIn position at which you want to find tenant 
 * @return tenant details at positionIn
 */
public Tenant getTenant(int positionIn)
{
    for(int i = 0; i<= tList.size(); i++)
    {
        
        if(positionIn ==i )
        {
           Tenant demo = tList.get(i);
           return demo;
        }
    }
    return null;
}


/**reads total number of tenant 
 * 
 * @return retuns total number of tenant in the list
 */
public int getTotal()
{
    return tList.size();
}



@Override
public String toString()
{
    return tList.toString();
}

}
