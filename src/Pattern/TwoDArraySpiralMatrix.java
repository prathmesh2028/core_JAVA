package Pattern;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        print2D(spiralmatrix(n));

    }
    public static int[][] spiralmatrix(int n ){
        int[][] arr = new int[n][n];
        int num = 1;

        int fc = 0 , fr = 0;
        int lc = arr[0].length-1 , lr = arr.length - 1;

        // while condition
        while(fc <= lc && fr <= lr){
            //from left to right
            if(fc > lc) break;
            for(int i = fc ; i <= lc ; i++){
                arr[fr][i] = num;
                num++;
            }
            fr++;

            if(fr > lr) break;
            //top to down
            for(int i = fr ; i <= lr ; i++){
                arr[i][lc] = num;
                num++;
            }
            lc--;

            if(fc > lc) break;
            //right to left
            for(int i = lc ; i >= fc ; i--){
                arr[lr][i] = num;
                num++;
            }
            lr--;

            //down to top
            for(int i = lr ; i >= fr ; i--){
                arr[i][fc] = num;
                num++;
            }
            fc++;

        }
        return arr;
    }
    public static void print2D(int [][] a){
        for(int[] arr:a){
            for(int e:arr){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
