package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInJava {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You entered number is : " + x );
    }
}
