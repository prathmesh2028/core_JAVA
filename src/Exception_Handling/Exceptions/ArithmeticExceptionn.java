package Exception_Handling.Exceptions;

public class ArithmeticExceptionn {
    public static void main(String[] args) {
        int i = 0;
        int j = 44;

        try
        {
            j = 16/i;
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
