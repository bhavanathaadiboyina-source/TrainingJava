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

        System.out.println("Order Created : " + orderId);
    }

    public double calculateDiscount() {

        return totalAmount * 0.05;
    }

    public void displayOrder() {

        System.out.println("Order ID : " + orderId);
        System.out.println("Amount   : $" + totalAmount);
        System.out.println("Date     : " + orderDate);\
    \
    ]
    }
}

// Child Class 1
class PremiumOrder extends Order {

    private String membershipTier;

    public PremiumOrder(String orderId, double totalAmount,String membershipTier) {

        super(orderId, totalAmount);

        this.membershipTier = membershipTier;

        System.out.println("Premium Order Created");
    }

    @Override
    public double calculateDiscount() {

        double discount = super.calculateDiscount() + totalAmount * 0.10;

        return discount;
    }

    @Override
    public void displayOrder() {

        super.displayOrder();

        System.out.println("Membership : " + membershipTier);
    }
}

// Child Class 2
class RegularOrder extends Order {

    private int rewardPoints;

    public RegularOrder(String orderId,double totalAmount) {

        super(orderId, totalAmount);

        rewardPoints = (int)(totalAmount / 100);

        System.out.println("Regular Order Created");
    }

    @Override
    public double calculateDiscount() {

        double discount = super.calculateDiscount();

        return discount;
    }

    @Override
    public void displayOrder() {

        super.displayOrder();

        System.out.println("Reward Points : " + rewardPoints);
    }
}

// Main Class
public class EcommerceApp2{

    public static void main(String[] args) {

        System.out.println("Premium Order");

        PremiumOrder p = new PremiumOrder("ORD201",5000,"Gold");

        p.displayOrder();

        System.out.println("Discount : $" +p.calculateDiscount());

        System.out.println();

        System.out.println("Regular Order");

        RegularOrder r = new RegularOrder(
                "ORD202",
                3000);

        r.displayOrder();

        System.out.println("Discount : $" + r.calculateDiscount());
    }
}