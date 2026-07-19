class Main{
    public static void main(String args[]){
        try{
             int quantity = Integer.parseInt("abc");
             double price=100.0;
             double total=quantity*price;
             System.out.println("Total:"+ total);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid quantity entered. Please enter a number.");
            System.out.println("Using default quantity:1");
            double total=100.0;  //Fallback value
            System.out.println("Total:"+ total);
        }
        System.out.println("Checkout completed successfully!");
    }
} 