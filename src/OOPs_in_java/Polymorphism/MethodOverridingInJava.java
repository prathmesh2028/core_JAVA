package OOPs_in_java.Polymorphism;
class Base{
    void fun(){
        System.out.println("Base's fun");
    }
}
class Derived extends Base{
    @Override
    void fun(){
        System.out.println("Derived's fun");
    }
}
public class MethodOverridingInJava {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
