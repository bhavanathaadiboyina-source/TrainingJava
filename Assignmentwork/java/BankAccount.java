class BankAccount{
    
    private double balance;
    public void setBalance(double balance){
        if (balance<0){
            throw new IllegalArgumentException("Balance cannot be negative!");
        }
        this.balance=balance;
        System.out.println("Balance updated to:₹"+ this.balance);
    }
    public double getBalance(){
        // you can add logging here
        // System.out.printlm("Balance accessed at:"+newDate());
        return this.balance;
    }
}