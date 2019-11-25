package design.factory.factoryMethod;

public class JPGReaderFactory implements ReaderFactory{

    @Override
    public Reader getReader() {
        return new JPGReader();
    }

}
