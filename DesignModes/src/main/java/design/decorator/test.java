package design.decorator;

public class test {
    public static void main(String[] args) {
        WerewolfRole wr = new WerewolfRole();
        System.out.println(wr.getRole());
        System.out.println(wr.toString());
        Dirk d = new Dirk(wr);
        System.out.println(d.getRole());
        System.out.println(d.getAccouter());
        System.out.println(d.getAttribute());
        Wand w = new Wand(d);
        System.out.println(w.getRole());
        System.out.println(w.getAccouter());
        System.out.println(w.getAttribute());
    }
}
