package Basics.DynamicMethodDispatch;
class Computer{}
class Laptop extends Computer{}
class X{
    public void show(){
        System.out.println("In X show");
    }
}
class Y extends X{
    public void show(){
        System.out.println("In Y show");
    }
}
public class A {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();

        obj = new Y();
        obj.show();

    }
}
