package design.observer;

import org.junit.Test;

public class ObserverTest {
    
    @Test
    public void test() {
        Subject publisher = new Publisher();
        publisher.initObservers();
        
        Observer subOne = new SubscriberOne();
        publisher.registerObserver(subOne);
        
        Observer subTwo = new SubscriberTwo();
        publisher.registerObserver(subTwo);
        
        publisher.notifyObservers();
        
        publisher.removeObserver(subOne);
        
        publisher.notifyObservers();
        
        
    }
}
