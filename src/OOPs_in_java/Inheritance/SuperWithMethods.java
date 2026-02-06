package OOPs_in_java.Inheritance;
class person{
    void message(){
        System.out.println("This is person class");
    }
}
class Student extends person{
    void message(){
        System.out.println("This is a student class");
    }
    void display(){
        message();
        super.message();
    }
}
public class SuperWithMethods {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
