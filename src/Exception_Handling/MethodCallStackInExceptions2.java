package Exception_Handling;

public class MethodCallStackInExceptions2 {
    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("exit main()");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught");
            e.printStackTrace();
        }
    }
    public static void methodA(){
        System.out.println("Entered in method A");
        try{
            int a = 5 , b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught in methoA()");
        }
        finally{
            System.out.println("finally block runsssss");
        }
        System.out.println("Exited the methodA()");
    }
}
