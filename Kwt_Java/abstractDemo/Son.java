package abstractDemo;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("Son career");
    }

    @Override
    void partner() {
        System.out.println("Partner Son career");
    }
}

