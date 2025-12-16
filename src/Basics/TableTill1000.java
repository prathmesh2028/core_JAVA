package Basics;

import java.io.FileWriter;
import java.util.Scanner;

public class TableTill1000 {
    public static void main(String[] args) throws java.io.IOException {
        FileWriter fr = new FileWriter("data.txt");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you wants the table :");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
           for(int j = 1 ; j <= 10 ; j++){
               fr.write((i*j) + "\t");
           }
           fr.write("\n");
        }

        fr.close();
        sc.close();
    }
}
