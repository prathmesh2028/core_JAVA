package Basics;

public class AdditionOfNumbersUsingRecursion {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(addtill(n));
    }
    public static int addtill(int n){
        if(n == 1 || n == 0) return n;
        return addtill(n-1) + n;
    }
}
