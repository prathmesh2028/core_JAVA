package OOPs_in_java.Inheritance;
class Animal{
    void sound(){
        System.out.println("Animal Makes sound");
    }
}
class Dog  extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}
public class Inheritance_1 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}
