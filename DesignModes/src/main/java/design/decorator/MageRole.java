package design.decorator;

public class MageRole extends Role{

    public MageRole() {
        physicalInjury = 10;
        magicDamage = 150;
        HP = 100;
    }
    
    @Override
    public String getRole() {
        return "职业: 魔法师";
    }
}
