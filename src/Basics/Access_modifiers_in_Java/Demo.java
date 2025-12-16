package Basics.Access_modifiers_in_Java;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        System.out.println(A.marks);
        System.out.println(B.marks);
    }
}
