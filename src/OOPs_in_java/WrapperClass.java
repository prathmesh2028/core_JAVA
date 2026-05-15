package OOPs_in_java;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;

        Integer num1 = new Integer(num); // autoboxing

        int num2 = num1.intValue(); // autounboxing

        System.out.println(num2);


        String str = "12345";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
}
