package design.adapter.oldAdapter;

public interface Account {
    /**
     * 获取账户余额
     */
    public double getBalance();
    /**
     * 是否可以透支
     */
    public boolean isOverdraftAvailable();
    /**
     * 贷款
     */
    public void credit(final double credit);
}
