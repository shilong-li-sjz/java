package design.decorator;

public abstract class Role {
    
    String accouter = "none";
    String role = "none";
    
    Integer physicalInjury  = 0;
    Integer magicDamage = 0; 
    Integer HP = 0;
    
    public int getPhysicalInjury() {
        return physicalInjury;
    }
    
    public int getMagicDamage() {
        return magicDamage;
    }
    
    public int getHP() {
        return HP;
    }
    
    public String getRole() {
        return role;
    }
    
    public String getAccouter() {
        return accouter;
    }
    
    public String toString() {
        return "physicalInjury=" + physicalInjury + ", magicDamage=" + magicDamage + ", HP" + HP;
    }
}
