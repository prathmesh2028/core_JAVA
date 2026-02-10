package Exception_Handling;
public class MethodCallStackInExceptions {
    public static void main(String[] args) {
        methodA();
        System.out.println("end of the main method");
    }

    private static void methodA() {
        methodB();
    }

    private static void methodB() {
        int a  = 10 , b = 0;
        int c = a / b;
    }


    /*
    O/P :-
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception_Handling.MethodCallStackInExceptions.methodB(MethodCallStackInExceptions.java:14)
	at Exception_Handling.MethodCallStackInExceptions.methodA(MethodCallStackInExceptions.java:9)
	at Exception_Handling.MethodCallStackInExceptions.main(MethodCallStackInExceptions.java:4)
     */
}
