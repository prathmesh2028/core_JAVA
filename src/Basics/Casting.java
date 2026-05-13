package Basics;

public class Casting {
    public static void main(String[] args) {
        // implicit casting
        short x = 1;
        int y = x + 2;

        //expicit casting
//        double a = 1.1;
//        int b = (int)a + 2;

        // for string
//        String q = "1";
//        int w = Integer.parseInt(q) + 2;
//        System.out.println(w);


        String q = "1.1";
        double w = Double.parseDouble(q) + 2;
        System.out.println(w);

        int a = 257;
        byte t = (byte)a;
        System.out.println(t);


        float f = 5.6f;
        int d = (int)f;
        System.out.println(d);


        // type promotion
        byte g = 10;
        byte r = 30;
        int result = g * r;
        System.out.println(result);
    }
}
