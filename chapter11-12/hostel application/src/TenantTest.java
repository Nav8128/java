public class TenantTest {
    public static void main(String[] args) {
        Tenant t = new Tenant("nav", 1);
        Payment pt= new Payment("january", 5000);
        Payment pt2 = new Payment("february", 4000);
        
       
        t.makePayment(pt);
        t.makePayment(pt2);
       
        System.out.println(t.toString());
        System.out.println(t.getPayments());
    }
    
}
