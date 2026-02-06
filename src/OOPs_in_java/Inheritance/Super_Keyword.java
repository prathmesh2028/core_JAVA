package OOPs_in_java.Inheritance;
class Parent{
     int age = 54;
}
class Child extends Parent{
    void parentage(){
        System.out.println(super.age);
    }
}
public class Super_Keyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.parentage();
    }
}
