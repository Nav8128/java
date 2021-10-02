

public class PaymentListTest {
    public static void main(String[] args) {
        
        PaymentList pt= new PaymentList(4);
        Payment p1 = new Payment("jan", 1500);
        Payment p2 = new Payment("feb", 2000);
        Payment p3 = new Payment("jan", 1500);
        Payment p4 = new Payment("feb", 2000);
        Payment p5 = new Payment("feb", 2000);
        System.out.println(pt.addPayment(p1));
        System.out.println(pt.addPayment(p2));
        System.out.println(pt.addPayment(p3));
        System.out.println(pt.addPayment(p4));
        System.out.println(pt.addPayment(p5));
        System.out.println();


        System.out.println(pt.getPayment(3));
        System.out.println(pt.getPayment(6));
         System.out.println();



        System.out.println(pt.calculateTotalPaid());
         System.out.println();


        System.out.println(pt.getTotal());
        System.out.println();


        System.out.println(pt.toString());
    }
}
