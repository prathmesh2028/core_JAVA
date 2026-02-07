package OOPs_in_java.Polymorphism;
class Parent4{
    Parent4 newObj(){
        System.out.println("Parent object");
        return new Parent4();
    }
}
class Child4 extends Parent4{
    @Override
    Child4 newObj(){
        System.out.println("child object");
        return new Child4();
    }
}
public class CovarientReturnTypes {
    public static void main(String[] args) {
        Parent4 p4 = new Child4();
//        System.out.println(p4.newObj().toString());
        p4.newObj();
    }
}
