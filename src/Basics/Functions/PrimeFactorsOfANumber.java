package Basics.Functions;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.println(factors(n).toString());
    }
    public static ArrayList<Integer> factors(int n ){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2 ; i <= n ; i++){
            if(n%i == 0){
                list.add(i);
                n = n/i;
            }
        }
        return list;
    }
}
