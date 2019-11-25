package design.factory.factoryMethod;

public class JPGReader implements Reader{

    @Override
    public void read() {
        System.out.println("read jpg");
    }
}
