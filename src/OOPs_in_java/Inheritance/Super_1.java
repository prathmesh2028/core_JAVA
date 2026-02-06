package OOPs_in_java.Inheritance;
class Vehicle{
    int maxSpeed = 120;
}
class Car extends Vehicle {
    int maxSpeed = 100;
    void display(){
        System.out.println("Maximum speed : " + super.maxSpeed);
    }
}
public class Super_1 {
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.display();
    }
}
