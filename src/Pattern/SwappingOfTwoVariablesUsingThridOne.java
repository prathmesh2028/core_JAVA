package Pattern;

import java.util.Scanner;

public class SwappingOfTwoVariablesUsingThridOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping numbers are : " + a + " " + b);
    }
}
