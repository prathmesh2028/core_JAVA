package Basics;

import java.io.IOException;
import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number :");
//        int num = System.in.read();
//        System.out.println(num - 48);
        // this system.in.read() reads only one character

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int num = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();


        // scanner class
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
