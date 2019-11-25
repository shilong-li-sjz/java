package design.adapter.newAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("the turkey says");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nthe Duck says");
        testDuck(duck);
        
        System.out.println("\n the turkeyAdapter says");
        testDuck(turkeyAdapter);
    }
    
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
