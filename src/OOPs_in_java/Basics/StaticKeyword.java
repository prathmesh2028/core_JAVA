package OOPs_in_java.Basics;

class Mobile
{
    String brand;
    int price;
    static String name;
    static
    {
        name = "phone";
        System.out.println("In static block");
    }
    // making something as a class member , not object member :)
}

class A
{
    public A()
    {
        System.out.println("Object created");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}
public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        obj1.name = "smartphone";

        // loads the class
//        Class.forName("Mobile");


        new A().show();

    }
}
