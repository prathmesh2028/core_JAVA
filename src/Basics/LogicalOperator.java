package Basics;

public class LogicalOperator {
    public static void main(String args[])
    {
        // || OR => true if any one is T
        // && AND => true if both T
        // ! NOT => reverts the o/p

        int x = 7;
        int y  = 5;

        int a = 5;
        int b = 9;

        boolean result = (x > y) && (a <  b);
        result = (x > y) || (a <  b);
        System.out.println(!result);
    }
}
