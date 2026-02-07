package OOPs_in_java.Polymorphism;
class Parent3{
    static void fun(){
        System.out.println("parent's fun");
    }
}
class Child1 extends Parent3{
    static void fun(){
        System.out.println("Child's fun");
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        // always remember that static methods are not overriden
        Parent3 p = new Child1();
        p.fun(); // calls parents method
    }
}
