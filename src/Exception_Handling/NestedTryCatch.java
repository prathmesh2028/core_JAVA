package Exception_Handling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Try outer block started...!");
            try{
                int n = 10;
                int res = n / 0;
            }
            catch(ArithmeticException e){
                System.out.println("Caught the arithmetic exception in inner try catch");
                System.out.println(e.getMessage());
            }

            try{
                String s = null;
                System.out.println(s.length());
            }
            catch(NullPointerException e){
                System.out.println("caught the null pointer exception");
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println("caught the exception in outer try catch");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block executed...!");
        }
    }
}
