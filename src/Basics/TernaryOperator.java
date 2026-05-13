package Basics;

public class TernaryOperator {
    public static void main(String[] args) {

        // ternary operator one liner shortcut for if else :)

        int n = 3;

        int result = 0;

        result = (n % 2 == 0) ? (result = 10) : 20;
        System.out.println(result);
    }
}
