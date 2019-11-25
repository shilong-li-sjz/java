package design.decorator;

public class Dirk extends AccouterDecorator{
    
    private Role role;
    
    public Dirk(Role role) {
        this.role = role;
    }
    
    @Override
    public String getRole() {
        return role.getRole();
    }
    
    @Override
    public String getAccouter() {
        if (role.getAccouter().equals("none"))
            return "短剑; ";
        else
            return role.getAccouter() + "短剑; ";
    }
    
    public String getAttribute() {
        return "physicalInjury=" + (role.getPhysicalInjury() + 30) + ", magicDamage=" + (role.getMagicDamage() + 5) + ", HP" + (role.getHP() + 10);
    }
}
