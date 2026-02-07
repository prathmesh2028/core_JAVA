package OOPs_in_java.Polymorphism;

class Parent2{
    void fun(){
        System.out.println("Parent's fun");
    }
}
class Child extends Parent2{
    void fun(){
        System.out.println("Child's fun");
    }
}
class GrandChild extends Child{
    void fun(){
        System.out.println("GrandChild's fun");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent2 p1 = new Child();
        Parent2 p2 = new GrandChild();
        p1.fun();
        p2.fun();
    }
}
