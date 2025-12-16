package Basics.ObjectMethods;
class Laptop{
    String name;
    double price;
    public String toString(){
        return "HELLO WORLD" ;
    }
}
public class Demo {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.name = "HP Victus Ryzen 5";
        l.price = 80000;

        System.out.println(l); // hexstring hashcode
        System.out.println(l.toString());


        Laptop l2 = new Laptop();
        l2.name = "Dell laptop sample";
        l2.price = 20000;
        System.out.println(l2);
        System.out.println(l2.toString());


        boolean result = l.equals(l2);
        System.out.println(result);

    }
}
