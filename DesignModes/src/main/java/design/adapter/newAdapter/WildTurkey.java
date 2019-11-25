package design.adapter.newAdapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    @Override
    public void fly() {
        System.out.println("i am flying short distance");
    }
}
