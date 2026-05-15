package OOPs_in_java;

//import OOPs_in_java.Inheritance.Calc;

final class Calc
{
    final public void show()
    {
        System.out.println("In Calc show");
    }
    public void add(int a , int b)
    {
        System.out.println(a + b);
    }
}

//class C extends Calc // inheritance is not possible as the class is final
//{
//
//}

//class S extends Calc
//{
//    public void show() // this method can not be overridden as the same method is in super class as final
//    {
//        System.out.println("In S show");
//    }
//}
public class FinalKeyword {
    public static void main(String[] args) {
//        final int num = 10;
//        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
    }
}
