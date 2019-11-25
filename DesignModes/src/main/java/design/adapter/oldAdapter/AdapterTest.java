package design.adapter.oldAdapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test() {
        StandardAccount sa = new StandardAccount(2000);
        System.out.println(sa.getBalance());
        
        AccountAdapter adapter = new AccountAdapter(new OffshoreAccount(2000));
        System.out.println("account balance=" + adapter.getBalance());
    }
}
