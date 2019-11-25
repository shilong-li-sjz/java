package design.factory.factoryMethod;

public class PNGReaderFactory implements ReaderFactory{

    @Override
    public Reader getReader() {
        return new PNGReader();
    }
    
}
