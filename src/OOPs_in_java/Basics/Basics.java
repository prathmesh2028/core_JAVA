package OOPs_in_java.Basics;

class Calculator
{
    // METHOD OVERLOADING CONCEPT :)

     public int add(int num1 , int num2)
     {
         int result = num1 + num2;
         return result;
     }

     public int add(int n1 , int n2 , int n3)
     {
         return n1 + n2 + n3;
     }

     public double add(double n1 , double n2)
     {
         return n1 + n2;
     }
}
public class Basics {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1 , num2);
//        int result = num1 + num2;
        System.out.println(result);
    }


}
