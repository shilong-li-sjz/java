package design.observer;

public interface Subject {
    
    public void registerObserver(Observer input);
    
    public void removeObserver(Observer input);
    
    public void notifyObservers();
    
    public void initObservers();
}
