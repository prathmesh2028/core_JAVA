package OOPs_in_java.Encapsulation;

class Human
{
    private int age;
    private String name;

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
}

public class Encapsul {
    public static void main(String[] args) {
        Human ram = new Human();
        ram.setAge(30);
        ram.setName("Rameshwaram Chettinadamul");
        System.out.println(ram.getAge());
        System.out.println(ram.getName());
    }
}
