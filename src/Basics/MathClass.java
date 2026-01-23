package Basics;

public class MathClass {
    public static void main(String[] args) {
        double a = Math.round(1.1f);
        a = Math.ceil(1.1f);
        a = Math.floor(1.1f);
        int b = Math.max(1,2);
        int c = Math.min(1,2);

        // random
        double result = Math.round((Math.random()*100));
        System.out.println(result);
    }
}
