package design.observer;

public class SubscriberOne implements Observer{
    
    public SubscriberOne() {
        
    }
    
    @Override
    public void update(String editon) {
        System.out.println("one receive msg " + editon);
    }

    @Override
    public String toString() {
        return "SubscriberOne";
    }
}
