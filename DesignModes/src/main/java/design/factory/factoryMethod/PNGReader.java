package design.factory.factoryMethod;

public class PNGReader implements Reader{

    @Override
    public void read() {
        System.out.println("read png");
    }

}
