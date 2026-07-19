interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}

interface Taxable {
    double calculateTax();
    void generateTaxInvoice();
}

interface Loggable {
    void logActivity(String action);
}

// PayPal Payment
class PayPalPayment implements Payable, Taxable, Loggable {

    private String email;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing PayPal payment: $" + amount);
        status = "SUCCESS";
        logActivity("Payment processed: $" + amount);
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment: $" + amount);
        status = "REFUNDED";
        logActivity("Refund processed: $" + amount);
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.10;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("Tax Invoice:");
        System.out.println("Transaction: PayPal");
        System.out.println("Amount: $" + amount);
        System.out.println("Tax (10%): $" + tax);
        System.out.println("Total: $" + (amount + tax));
    }

    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] PayPal: " + action + " at " + new java.util.Date());
    }
}

// UPI Payment
class UPIPayment implements Payable, Taxable, Loggable {

    private String upiId;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing UPI payment: $" + amount);
        status = "SUCCESS";
        logActivity("Payment processed: $" + amount);
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding UPI payment: $" + amount);
        status = "REFUNDED";
        logActivity("Refund processed: $" + amount);
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.05;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("Tax Invoice:");
        System.out.println("Transaction: UPI");
        System.out.println("Amount: $" + amount);
        System.out.println("Tax (5%): $" + tax);
        System.out.println("Total: $" + (amount + tax));
    }

    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] UPI: " + action + " at " + new java.util.Date());
    }
}

// Main Class
public class PaymentDemo {
    public static void main(String[] args) {

        PayPalPayment paypal = new PayPalPayment("bhavana@gmail.com");
        paypal.processPayment(1000);
        System.out.println("Status: " + paypal.getPaymentStatus());
        paypal.calculateTax();
        paypal.generateTaxInvoice();

        System.out.println();

        UPIPayment upi = new UPIPayment("bhavana@upi");
        upi.processPayment(2000);
        System.out.println("Status: " + upi.getPaymentStatus());
        upi.calculateTax();
        upi.generateTaxInvoice();

        upi.refundPayment(2000);
        System.out.println("Status after Refund: " + upi.getPaymentStatus());
    }
}