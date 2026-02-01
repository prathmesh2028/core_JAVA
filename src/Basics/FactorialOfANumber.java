package Basics;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 4;
        long  facto = 1;
        for(int i = 1 ; i <= n ; i++){
            facto *= i;
        }
        System.out.println(facto);
    }

}
