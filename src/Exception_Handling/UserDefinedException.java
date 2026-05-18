package Exception_Handling;

class Prathmesh extends Exception
{
    Prathmesh(String msg)
    {
        super(msg);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
            if(j == 0) throw new Prathmesh("j cannot be 0 :)");
        }
        catch(Prathmesh e)
        {
            System.out.println("That's the default value there" + e);
        }
    }
}
