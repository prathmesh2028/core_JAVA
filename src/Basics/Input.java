package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age = sc.nextByte();
//        byte age = sc.nextInt();
//        byte age = sc.nextBoolean();
        System.out.println(age);
    }
}
