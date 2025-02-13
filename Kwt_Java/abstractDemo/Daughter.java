package abstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Daughter career");
    }

    @Override
    void partner() {
        System.out.println("Partner daughter career");
    }
}

