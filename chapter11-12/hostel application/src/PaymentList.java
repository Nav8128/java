import java.util.ArrayList;



/**collection class to hold payments
 * @author navneet
 * @version 29th sempetmber 2021
 */ 
public class PaymentList {
    

    private ArrayList<Payment> pList = new ArrayList<>();
    public final int MAX ;
    



    /**
     * contructor for PaymentLIst
     * @param MAXIn for maximum number of payments
     */

    public PaymentList(int MAXIn)
    {
       MAX = MAXIn;
    }





   /** checks if the list is full or not
   * 
   * @return returns boolean value of true if list is not full else vise versa 
   */

    public boolean isFull()
    {
       
    if (pList.size() == MAX-1)
    {
        return true;
    }

    return false;
    }





    /**add payments
     * 
     * @param pIn the payment ypu want to add
     * @return returns boolean value of true for succesfull addition of payment else vise versa
     */

    public boolean addPayment(Payment pIn)
    {
        if(!isFull())
        {
            pList.add(pIn);
            return true;
        }
        return false;
    }





     /** to get the payment histiory of a particular position in the list
    * 
    * @param positionIn the position of that payment in the list
    * @return the payment history of positionIn in the list
    */

    public Payment getPayment(int positionIn)
    {
        if(positionIn >= 0 && positionIn <= pList.size()-1)
        {
            Payment p = pList.get(positionIn);
            return p;  
        }
        return null;
    }






    /**to clculate the total amount paid till now
     * 
     * @return returns the sum of total amount of list 
     */

    public double calculateTotalPaid()
    {
        double total = 0;
        for(int i = 0; i<=pList.size() - 1 ; i++)
        {
            Payment p = pList.get(i);
            double amount =  p.getAmount();
             total = total + amount;
             

        }
        return total;
    }






    /**to get total number of payments in thje list
     * 
     * @return total size of list
     */

    public int getTotal()
    {
        return pList.size();
    }






    @Override
    public String toString()
    {
        return pList.toString();
    }
    
}
