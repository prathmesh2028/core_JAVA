package Basics.Final_keyword;
class Calc{
    public void show(){
        System.out.println("In calc show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.show();
        c.add(9,8);
    }
}
