package OOPs_in_java.Basics;

class Human
{
    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {
    }
}

public class Constructors {
    public static void main(String[] args)
    {
        Human pb = new Human();
        Human obj1 = new Human( 200 , "PRATHMESH");
        System.out.println(pb.getAge() + " " + pb.getName());
        System.out.println(obj1.getAge() + " " + obj1.getName());

    }
}
