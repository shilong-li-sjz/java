package design.decorator;

public class Wand extends AccouterDecorator{
    private Role role;
    
    public Wand(Role role) {
        this.role = role;
    }
    
    @Override
    public String getRole() {
        return role.getRole();
    }
    
    @Override
    public String getAccouter() {
        if (role.getAccouter().equals("none"))
            return "法杖;";
        else
            return role.getAccouter() + "法杖;";
    }
    
    public String getAttribute() {
        return "physicalInjury=" + (role.getPhysicalInjury() + 10) + ", magicDamage=" + (role.getMagicDamage() + 50) + ", HP" + (role.getHP() + 10);
    }
}
