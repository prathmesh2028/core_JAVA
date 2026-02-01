package Basics;
import java.util.Scanner;
public class NumberReversingWithoutUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.print("Initially the number is : " + n);

        int num = n;
        int revnum = 0;
        while(num > 0){
            int digit = num % 10;
            revnum = revnum*10;
            revnum += digit;
            num /= 10;
        }
        System.out.println("The number after reversing is : " + revnum);
    }
}
