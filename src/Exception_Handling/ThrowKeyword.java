package Exception_Handling;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
            if(j == 0) throw new ArithmeticException("j cannot be 0 :)");
        }
        catch(ArithmeticException e)
        {
            System.out.println("That's the default value there" + e);
        }
    }
}
