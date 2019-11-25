package design.adapter.oldAdapter;

public class AccountAdapter extends AbstractAccount {
    private OffshoreAccount offshoreAccount;
    
    public AccountAdapter(final OffshoreAccount offshoreAccount) {
        super(offshoreAccount.getOffShoreBalance());
        this.offshoreAccount = offshoreAccount;
    }
    
    /**
     * 
     */
    public double getBalance() {
        final double taxRate = offshoreAccount.getTaxRate();
        final double grossBalance = offshoreAccount.getOffShoreBalance();
        final double taxableBalance = grossBalance * taxRate;
        final double balanceAfterTax = grossBalance - taxableBalance;
        return balanceAfterTax;
    }
}
