package Exception_Handling;

import java.util.Scanner;

public class Throw_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the user :");
        int age = sc.nextInt();
        if(age < 18){
            throw new ArithmeticException("age must be > or = to 18");
        }
        System.out.println("program executed...!");
    }
}
