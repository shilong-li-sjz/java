package design.decorator;

public class WerewolfRole extends Role{

    public WerewolfRole() {
        physicalInjury = 100;
        magicDamage = 10;
        HP = 200;
    }

    @Override
    public String getRole() {
        return "职业: 狼人";
    }
}
