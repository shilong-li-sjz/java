package design.comand;

public class LightOnComand implements Comand{

    Light light;
    
    public LightOnComand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }

}
