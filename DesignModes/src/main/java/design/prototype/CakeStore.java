package design.prototype;

public class CakeStore {
    public static void main(String[] args) {
        CheeseCake cheeseCake = new CheeseCake();
        cheeseCake.setSugar("100g");
        cheeseCake.setBuuter("200");
        cheeseCake.setCheese("300");
        
        System.out.println("已存在的实例" + cheeseCake);
        
        CheeseCake cc1 = (CheeseCake) cheeseCake.prepareCake();
        cc1.setName("cc1");
        
        System.out.println("原型模式第一个实例: " + cc1);
        System.out.println("原型模式第一个实例: " + cc1.getBuuter());
        
        CheeseCake cc2 = (CheeseCake)cheeseCake.prepareCake();
        cc2.setName("cc2");
        System.out.println("第二个实例: " + cc2);
        
        cc1.setBuuter("300");
        System.out.println("第一个: " + cc1.getBuuter());
        System.out.println("第二个: " + cc2.getBuuter());
        System.out.println("原型: " + cheeseCake.getBuuter());
    }
}
