package design.state;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    
    @Override
    public void insertQuarter() {
        System.out.println("don't have gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, please insert quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry, please insert quarter");
    }

    @Override
    public void dispense() {
        System.out.println("sorry, please insert quarter");
    }

}
