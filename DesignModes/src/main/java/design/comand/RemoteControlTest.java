package design.comand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnComand lightOn = new LightOnComand(light);
        Door door = new Door();
        GarageDoorOpenComand doorOpen = new GarageDoorOpenComand(door);
        
        
        remote.setComand(lightOn);
        remote.buttonWasPressed();
        
        remote.setComand(doorOpen);
        remote.buttonWasPressed();
    }
}
