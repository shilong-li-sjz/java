package design.prototype;

public class CheeseCake implements Cake {

    private String sugar;
    
    private String buuter;
    
    private String cheese;
    
    private String name;
    
    @Override
    public Cake prepareCake() {
        Cake cake = null;
        /**
         * 
         */
        try {
            cake = (Cake)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cake;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getBuuter() {
        return buuter;
    }

    public void setBuuter(String buuter) {
        this.buuter = buuter;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
