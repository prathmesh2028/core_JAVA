package OOPs_in_java.Basics;

public class OOP {
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        int result = cal.add(3,4);
        int result1 = cal.add(1,2,3);
        System.out.println(result);
        System.out.println(result1);
    }
}
