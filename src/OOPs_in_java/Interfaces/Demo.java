package OOPs_in_java.Interfaces;


// if a abstract class has only abstract methods
// alternate method for this is interfaces
// interface is not a class
// every method in interface is public abstract
//abstract class A
//{
//    public abstract void show();
//    public abstract void config();
//}
// each and every variable in interface is final and static by default

// class -> class = extends
// class -> interface = implements
// interface -> interface = extends

import OOPs_in_java.Abstraction.Interface;

interface A
{
    int age = 20;
    String area = "Pune";
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A ,X
{
    @Override
    public void show() {
        System.out.println("In B show");
    }

    @Override
    public void config() {
        System.out.println("In B config");
    }

    @Override
    public void run() {
        System.out.println("in run of B class implemented by X interface");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
