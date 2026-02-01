package Pattern;

public class SwappingOfTwoVariablesWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        //method 1
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a + " " + b);


        // method 2
        a = a ^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
