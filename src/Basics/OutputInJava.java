package Basics;

public class OutputInJava {
    public static void main(String[] args) {
//          int x = 10 , Y = 20;
//          char z = 'G';
//          String str = "GFG";

          // priting the outputs using println and print
//        System.out.println(x);
//        System.out.println(x+Y);
//        System.out.println(x + " " + Y);
//        System.out.print(str + " ");
//        System.out.print("Courses\n");


        // o/p using format and printf
        int x = 100 , y = 200;
        System.out.format("value of x is %d\n" , x);
        double Y = Math.PI;
        System.out.println(Y);
        System.out.format("Value of PI is %.2f\n" , Y);
        System.out.format("Value of PI is %5.2f\n" , Y);
        System.out.format("Value of PI is %05.2f\n" , Y);
        System.out.printf("x = %d , Y = %f" , x , Y);










    }
}
