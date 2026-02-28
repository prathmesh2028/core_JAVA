package Practise;
/*
🔹 1. Variables & Data Types (Coding)

Take two numbers and swap them without using a third variable.

Convert temperature from Celsius to Fahrenheit.

Create a program that prints size (in bytes) of all primitive data types.
 */
public class Q1 {
    public static void main(String[] args) {
        int a = 44;
        int b = 12;

    }
    public static void swap(int a , int b){
        System.out.println(a + " " + b);
        a = a-b;
        b = b-a;
        a = a-b;
        System.out.println(a + " " + b);
    }
    public static int ctof(int t){
        int ans = (9/5)*t + 32;
        return ans;
    }
    public static void sizeofall(){
        int a = 1;
        boolean b = false;
        float c = 3.2f;
        double d = 4.44;
        char e = 'a';
        String str = "hello world";
        System.out.println(Integer.BYTES);
        System.out.println(Byte.BYTES);
        System.out.println(Double.BYTES);
        System.out.println(Character.BYTES);
    }
}
