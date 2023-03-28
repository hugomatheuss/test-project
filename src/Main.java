
public class Main {
    public static void main(String[] args) {

        Valores v = new Valores();

        System.out.println(v.ins(1));
        System.out.println(v.size());
        System.out.println(v.ins(2));
        System.out.println(v.size());
        System.out.println(v.del(0));
        System.out.println(v.size());
        System.out.println(v.del(1));
        System.out.println(v.size());
    }
}