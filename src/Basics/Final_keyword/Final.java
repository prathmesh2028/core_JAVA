package Basics.Final_keyword;
final class A{
    A(){
        System.out.println("In A class");
    }
}

/*
When you make a class as a final you can not inherit the another class from it
 */

//class B extends A{ // not possible
//    B(){
//        System.out.println("In B class");
//    }
//}



class X{
    final public void print(){
        System.out.println("Hello");
    }
}
// when a method is made final it cannot be overriden in another class
//class Y extends  X{
//    public void print(){ // error
//        System.out.println("Dello");
//    }
//}
public class Final {
    public static void main(String[] args) {
        final int num = 8;
//        num = 9; // num is not changable
        System.out.println(num);
    }
}
