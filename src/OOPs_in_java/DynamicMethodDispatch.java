package OOPs_in_java;

class P
{
    public void show()
    {
        System.out.println("In P show");
    }
}

class Q extends P
{
    public void show()
    {
        System.out.println("In Q show");
    }
}

class R extends Q
{
    public void show()
    {
        System.out.println("In R show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        P obj = new P();
        obj.show();

        obj = new Q();
        obj.show();

        obj = new R();
        obj.show();
    }
}
