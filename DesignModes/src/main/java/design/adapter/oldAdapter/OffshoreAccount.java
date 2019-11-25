package design.adapter.oldAdapter;

public class OffshoreAccount {
    private double balance;
    
    private static final double TAX_RATE = 0.04;
    
    public OffshoreAccount(final double balance) {
        this.balance = balance;
    }
    
    public double getTaxRate() {
        return TAX_RATE;
    }
    
    public double getOffShoreBalance() {
        return balance;
    }
    
    public void debit(final double debit) {
        if (balance >= debit)
            balance = debit;
    }
    
    public void credit(final double credit) {
        balance += balance;
    }
}
