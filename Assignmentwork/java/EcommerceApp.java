import java.util.Date;
class Order{
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    // parent constructor-Parameterized constructor
    public Order(String orderId, double totalAmount){
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();
        System.out.println("Order created:" + orderId);
    }
    // parent method
    public double calculateDiscount(){
        // Base discount: 5% for all orders
        return totalAmount*0.05;

    }
    public void displayOrder(){
        System.out.println("Order Id:" +orderId);
        System.out.println("Amount :$" +totalAmount);
        System.out.println("Date :" +orderDate);


    }
}
class PremiumOrder extends Order{
    private String membershipTier;
    private double cashback;

    //using super() to call parent constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier){
        super(orderId, totalAmount);   // Must be the first
        this.membershipTier = membershipTier;
        this.cashback = totalAmount*0.10;  // 10% cashback
        System.out.println("Cashback"+ cashback+"----");
        System.out.println("Premium order with"+ membershipTier+"membership");
    }   

    // overriding with super to reuse parent logic
    @Override
    public double calculateDiscount(){
        // Get parent's discount (5%)and add premium discount(10%)
        double baseDiscount = super.calculateDiscount(); //calling parent method
        double premiumDiscount = totalAmount*0.10;
        double finalDiscount = baseDiscount + premiumDiscount;
        System.out.println("Premium discount applied"+ finalDiscount);
        return finalDiscount;
    }
    @Override
    public void displayOrder(){
        super.displayOrder(); // call parent's display
        System.out.println("Membership:" + membershipTier);
        System.out.println("Cashback: $" +cashback);
    }
}
// Usage
public class EcommerceApp{
    public static void main(String[] args){
        PremiumOrder order = new PremiumOrder("ORD123",5000,"Gold");
        order.displayOrder();
        order.calculateDiscount();
    }
}    
    



//Parent Class - Order
//Child Class - PremiumOrder
//Inheritance - PremiumOrder extends Order
//Parent Constructor - Order()
same class name: we can identify Constructor
//Child Constructor - PremiumOrder()
//super() - Calls parent constructor
//super.calculateDiscount() - Calls parent calculateDiscount() method
//super.displayOrder() - Calls parent displayOrder() method
//Method Overriding - calculateDiscount() and displayOrder()
//Object - PremiumOrder order = new PremiumOrder("ORD123", 5000, "Gold");