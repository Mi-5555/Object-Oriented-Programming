import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        A v = new A();
        System.out.println("for A class");
        v.Add(2,3);
        v.Add(2.3f, 2.7f);
        B m = new B();
        System.out.println("for B which is inherited from A class");
        m.Add(2,3);
        C p = new C(); //constructor created, object Instantiation
        p.run();
        p.walk();
    }
}

class A  //ENCAPSULATION
{
    public void Add(int a, int b)
    {
        int c = a+b;
        System.out.println("this int sum " +c);
    }
    public void Add(float a, float b) //Overload
    {
        float c = a+b;
        System.out.println("this float sum " +c);
    }
}

class B extends A
{
    public void Add(int a, int b) //Override
    {
        int c = a*b;
        System.out.println("null override " +c);
    }
}

interface aaa // ABSTRACTION
{
    void run();
    void walk();
}

class C implements aaa
{
    public void run()
    {
        System.out.println("System is running");
    }

    public void walk()
    {
        System.out.println("System is walking");
    }
}