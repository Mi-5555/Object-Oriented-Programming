package InheritANDEncap;

public class Main {
    public static void main(String[] args)
    {
        A objA = new A();
        System.out.println("for A class");
        objA.Add(2,3);
        objA.Add(.2f, .3f);

        B objB = new B();
        System.out.println("for B class, inherited from A class");
        objB.Add(5, 5);

        C objC = new C();
        System.out.println("for C class");
        objC.run();
        objC.walk();
    }

//ENCAPSULATION
static class A
{
    public void Add(int a, int b)
    {
        System.out.println("Sum of INT: " + (a+b));
    }

    public void Add(float a, float b)  // OVERLOAD
    {
        System.out.println("Sum of FLOAT: " + (a+b));
   }
}

static class B extends A
{
    public void Add(int a, int b)
    {
        System.out.println("Null override:" + (a+b));
    }
}

interface ABC
{
    void run();
    void walk();
}

static class C implements ABC
{
    public void run()
    {
        System.out.println(("System is running"));
    }

    public void walk()
    {
        System.out.println("System is walking");
    }
}
}
