package Basics;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
//        Integer num1 = new Integer(26); // depreciated and marked for removal
        Integer num1 = num; // autoboxing
        int num2 = num1; // auto-unboxing
        System.out.println(num1);
        System.out.println(num2);




        int number = 3987;
        Integer obj = Integer.valueOf(number); // wrapping
        System.out.println(obj);



        String str = "23";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
}
