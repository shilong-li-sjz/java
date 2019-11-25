package design.factory.factoryMethod;

public class ClientMethod {
    public static void main(String[] args) {
        ReaderFactory f1 = new JPGReaderFactory();
        Reader r1 = f1.getReader();
        r1.read();
        
        ReaderFactory f2 = new PNGReaderFactory();
        Reader r2 = f2.getReader();
        r2.read();
        
        ReaderFactory f3 = new GIFReaderFactory();
        Reader r3 = f3.getReader();
        r3.read();
    }
}
