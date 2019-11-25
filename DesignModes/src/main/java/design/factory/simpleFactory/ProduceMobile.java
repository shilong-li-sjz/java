package design.factory.simpleFactory;

public class ProduceMobile {
    
    public static Mobile createMobile(int model) {
        Mobile m = null;
        if (model == 1) {
            m = new HWMobile();
        } else if (model == 2) {
            m = new AppleMobile();
        }
        m.getModel();
        return m;
    }
    
    public static void main(String[] args) {
        Mobile m = createMobile(1);
        Mobile m2 = createMobile(2);
    }
}
