package OOPs_in_java;
class Student {
    // Private data (hidden from outside world)
    private String name;
    private int age;

    // Public setter method (to modify data)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {        // validation logic
            this.age = age;
        }
    }

    // Public getter method (to access data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation_in_java {
    public static void main(String[] args) {
        Student s = new Student();

        // Can't access directly like:
        // s.name = "Prathamesh"; ❌ ERROR

        s.setName("Prathamesh");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
