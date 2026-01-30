package Arrays;

import java.util.Scanner;

public class JaggedArrayInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int [][] a = new int[n][];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = new int[i+1];
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = i;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
