package OOPs_in_java;

class A1
{
    int age;
    public void show()
    {
        System.out.println("In A show");
    }


    class B
    {
        public void config()
        {
            System.out.println("In config of class B");
        }
    }
}

public class ClassInsideClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        A1.B obj1= obj.new B();
        obj1.config();

    }
}
