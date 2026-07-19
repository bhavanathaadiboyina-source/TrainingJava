import java.util.Date;

// Parent Class
class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();

        System.out.println("Order Created: " + orderId);
    }

    public double calculateDiscount() {
        return totalAmount * 0.05;   // 5%
    }

    public void displayOrder() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Amount   : $" + totalAmount);
        System.out.println("Date     : " + orderDate);
    }
}

// Child Class
class PremiumOrder extends Order {

    protected String membershipTier;

    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);

        this.membershipTier = membershipTier;

        System.out.println("Premium Order Created");
    }

    @Override
    public double calculateDiscount() {

        double parentDiscount = super.calculateDiscount();

        double premiumDiscount = totalAmount * 0.10;

        return parentDiscount + premiumDiscount;
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Membership : " + membershipTier);
    }
}

// Grandchild Class
class VIPOrder extends PremiumOrder {

    private String vipLevel;

    public VIPOrder(String orderId, double totalAmount,String membershipTier, String vipLevel) {

        super(orderId, totalAmount, membershipTier);

        this.vipLevel = vipLevel;

        System.out.println("VIP Order Created");
    }

    @Override
    public double calculateDiscount() {

        double premiumDiscount = super.calculateDiscount();

        double vipDiscount = totalAmount * 0.15;

        double finalDiscount = premiumDiscount + vipDiscount;

        System.out.println("VIP Discount Applied : $" + finalDiscount);

        return finalDiscount;
    }

    @Override
    public void displayOrder() {

        super.displayOrder();

        System.out.println("VIP Level : " + vipLevel);
    }
}

// Main Class
public class EcommerceApp1 {

    public static void main(String[] args) {

        VIPOrder order = new VIPOrder("ORD101",5000,"Gold","Platinum");

        order.displayOrder();

        System.out.println("Total Discount : $" + .calculateDiscount());
    }
}