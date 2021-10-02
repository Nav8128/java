

/**class tenant to store tenant details
 * 
 */
public class Tenant{
private String name;
private int room;
private PaymentList Payments;
public static final int MAX = 12; 




/**contructer
 * 
 * @param nameIn name of the tenant
 * @param roomIn room number of the tenant
 */
public Tenant(String nameIn, int roomIn)
{
name = nameIn;
room = roomIn;
Payments = new PaymentList(MAX);
}


/**method that adds payment of tenant
 * 
 * @param pt payment parameter
 */
public void makePayment(Payment pt)
{
       Payments.addPayment(pt);
}


/**returns the name of the tenant
 * 
 * @return retruns name
 */
public String getName()
{
    return name;
}


/**returns the room number of tenant
 * 
 * @return returns room number
 */
public int getRoom()
{
    return room;
}


/**reads the payment of tenant
 * 
 * @return retruns the payment of tenant
 */
public PaymentList getPayments()
{
    return Payments;
}



@Override
public String toString()
{
    return (name +" : "+ room);
}
}