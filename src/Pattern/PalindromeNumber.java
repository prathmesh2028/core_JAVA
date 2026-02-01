package Pattern;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is palindrome or not : ");
        int n = sc.nextInt();
        int revnum = 0;
        int num = n;
        while(num > 0){
            int digit = num % 10;
            revnum = revnum * 10;
            revnum += digit;
            num /= 10;
        }
        if(n == revnum) System.out.print("The number is a palindrome");
        else System.out.println("Number is not a palindrome");
    }
}
