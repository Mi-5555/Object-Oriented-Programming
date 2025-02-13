package abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {// constructor of abstract class
        this.age = age;
        VALUE = 3245679;
    }
    static void hello(){
        System.out.println("Hi");
    }

    void simple(){
        System.out.println("Normal method");
    }

    abstract void career();
    abstract void partner();
}
