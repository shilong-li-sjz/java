package design.comand;

public class SimpleRemoteControl {
    private Comand slot;
    
    public SimpleRemoteControl() {}
    
    public void setComand(Comand input) {
        this.slot = input;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
}
