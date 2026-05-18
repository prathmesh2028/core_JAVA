package OOPs_in_java.Interfaces.FunctionalInterface;

//SAM :- Single abstract Method

@FunctionalInterface
interface A
{
//    void show(int i);
    int add(int i , int j);
}

public class Functionalinterface {
    public static void main(String[] args) {
//        A obj = new A()
//        {
//          public void show(int i)
//          {
//              System.out.println("In void show");
//          }
//        };
//        obj.show();

        // lambda expressions

//        A obj1 = () -> {
//            System.out.println("In A show");
//        };

        A obj1 = (i , j) -> (i+j);
        int res = obj1.add(4,5);
        System.out.println(res);
    }
}
