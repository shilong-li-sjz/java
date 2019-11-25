package design.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;

@Builder
public class Publisher implements Subject{
    public List<Observer> _observers = new ArrayList<>();
    
    public Publisher() {
        
    }
    
    @Override
    public void registerObserver(Observer input) {
        System.out.println("register observer " + input);
        _observers.add(input);
    }
    
    @Override
    public void removeObserver(Observer input) {
        System.out.println("remove observer");
        _observers.remove(input);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer temp : _observers) {
            System.out.println("send msg to observers");
            temp.update("publisher");
        }
    }
    
    @Override
    public void initObservers() {
        if (null == _observers) {
            _observers = new ArrayList<>();
        }
    }
}
