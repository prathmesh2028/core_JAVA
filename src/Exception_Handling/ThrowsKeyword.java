package Exception_Handling;

class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Exception_Handling.UserefinedException");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) /*throws ClassNotFoundException*/ {
        A obj = new A();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
