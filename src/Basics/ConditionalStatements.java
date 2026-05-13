package Basics;

public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 1;
        int y = 7;
        int z = 61;


        if(x > 10 && x <= 20){
            System.out.println("Hello");
        }
        else System.out.println("Mello");

        if (x > y){
            if(x > z) System.out.println("x is greater " + x);
        }
        else if(y > z){
            if(y > x) System.out.println("y is greater " + y);
        }
        else System.out.println("z is greater " + z);
    }

}
