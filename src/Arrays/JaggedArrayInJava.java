package Arrays;

import java.util.Scanner;

public class JaggedArrayInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        // Jagged array
        int[][] arr = new int[n][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        arr[2] = new int[2];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = new int[i+1];
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
