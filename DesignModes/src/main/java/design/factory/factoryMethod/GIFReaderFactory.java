package design.factory.factoryMethod;

public class GIFReaderFactory implements ReaderFactory{

    @Override
    public Reader getReader() {
        return new GIFReader();
    }
}
