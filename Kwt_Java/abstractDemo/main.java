package abstractDemo;

public class main {
    public static void main(String[] args) {
        Son objs = new Son(18);
            objs.career();
            objs.partner();
            objs.simple();

        Parent objd = new Daughter(21);
            objd.career();
            objd.partner();
            objd.simple();

        Parent.hello();
    }
}
