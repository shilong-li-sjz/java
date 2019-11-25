package design.adapter.oldAdapter;

/**
 * 白金账户：可以透支
 */
public class PlatinumAccount extends AbstractAccount {
    
    public PlatinumAccount(final double balance) {
        super(balance);
        setOverdraftAvailable(true);
    }
}
