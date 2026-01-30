package Basics;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        boolean isprime = true;
        int n = sc.nextInt();
        for(int i = 2 ; i < n ; i++){
            if((n%i) == 0){
                isprime = false;
                break;
            }
        }
        if(isprime) System.out.print("The number is prime");
        else System.out.println("The number is not a prime it is composite");
    }
}
