package design.comand;

public class GarageDoorOpenComand implements Comand{
    private Door door;
    
    public GarageDoorOpenComand(Door input) {
        this.door = input;
    }
    
    @Override
    public void execute() {
        door.open();
    }

}
