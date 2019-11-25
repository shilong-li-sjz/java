package design.adapter.oldAdapter;

public class AbstractAccount implements Account{

    /**
     * 账户余额
     */
    private double balance;
    /**
     * 是否可以透支
     */
    private boolean isOverdraftAvailable;
    
    public AbstractAccount(final double balance) {
        this.balance = balance;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    @Override
    public boolean isOverdraftAvailable() {
        return isOverdraftAvailable;
    }
    
    public void setOverdraftAvailable(boolean isOverdraftAvailable) {
        this.isOverdraftAvailable = isOverdraftAvailable;
    }

    @Override
    public void credit(double credit) {
        balance += credit;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "Balance= " + getBalance() + 
                "Overdraft: " + isOverdraftAvailable(); 
    }
}
