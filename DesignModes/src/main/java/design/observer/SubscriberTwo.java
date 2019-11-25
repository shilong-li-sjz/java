package design.observer;

public class SubscriberTwo implements Observer{
    
    @Override
    public void update(String editon) {
        System.out.println("two receive msg " + editon);
    }

    @Override
    public String toString() {
        return "SubscriberTwo";
    }
}
