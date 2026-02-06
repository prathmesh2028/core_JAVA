package OOPs_in_java.Inheritance;
class Person{
    Person(){
        System.out.println("Person Class Constructor");
    }
}
class Student1 extends Person{
    Student1(){
        super();
        System.out.println("Student class constructor");
    }
}
public class SuperWithConstructors {
    public static void main(String[] args) {
        Student1 s = new Student1();
    }
}
