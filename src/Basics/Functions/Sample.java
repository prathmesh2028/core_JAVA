package Basics.Functions;

public class Sample {
    public static void main(String[] args) {
        System.out.println("before call");
        fun();
        System.out.println("after call");
    }
    public static void fun(){
        System.out.println("Inside function body");
    }
}
