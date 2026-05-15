package OOPs_in_java;

class A2
{
    public void show()
    {
        System.out.println("In A2 show");
    }
}

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        A2 obj = new A2()
        {
            public void show()
            {
                System.out.println("In new show method");
            }
        };
        obj.show();
    }
}
