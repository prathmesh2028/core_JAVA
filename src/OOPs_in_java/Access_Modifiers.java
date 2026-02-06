package OOPs_in_java;
class A{
    private int x;
    int getx(){
        return x;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        A obj = new A();
//        System.out.println(obj.x); gives error
        System.out.println(obj.getx());
    }
}
