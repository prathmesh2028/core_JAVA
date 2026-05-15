package OOPs_in_java.MethodOverriding;

class A
{
    public void show()
    {
        System.out.println("In A show");
    }
    public void config()
    {
        System.out.println("In A config");
    }
}
class B extends A
{
   public void show()
   {
       System.out.println("In B show");
   }
   public void config()
   {
       System.out.println("In B config");
   }
}

public class MeOver {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.config();

        B obj1 = new B();
        obj1.config();
        obj1.show();
    }
}
