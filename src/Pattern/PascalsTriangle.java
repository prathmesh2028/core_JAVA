package Pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pascals triangle :");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    list.get(i).add(1);
                }
                else{
                    int val = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    list.get(i).add(val);
                }
            }
        }
        for(ArrayList<Integer> l:list){
            for(int e:l){
                System.out.print(" " + e + " ");
            }
            System.out.println();
        }
    }
}
