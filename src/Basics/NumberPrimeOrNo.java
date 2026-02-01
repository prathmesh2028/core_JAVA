package Basics;

import java.util.Scanner;

public class NumberPrimeOrNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i < n ; i++){
            if((n%i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.print("The number is a prime number");
        else System.out.print("The number is not a prime number");
    }
}
