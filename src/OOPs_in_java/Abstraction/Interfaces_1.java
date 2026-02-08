package OOPs_in_java.Abstraction;
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bike implements Vehicle{
    int speed;
    int gear;
    Bike(int s , int g){
        speed = s;
        gear = g;
    }

    @Override
    public void changeGear(int a) {
        gear = a;
        System.out.println("Gear changed to " + gear);
    }
    public void speedUp(int a){
        speed = a;
        System.out.println("Speed changed to " + speed);
    }
    public void applyBrakes(int a){
        speed -= 10;
        System.out.println("brake applied successfully....!");
        System.out.println("Speed is " + speed);
    }
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    Bicycle(int s , int g){
        speed = s;
        gear = g;
    }

    @Override
    public void changeGear(int a) {
        gear = a;
        System.out.println("Gear changed to " + gear);
    }
    public void speedUp(int a){
        speed = a;
        System.out.println("Speed changed to " + speed);
    }
    public void applyBrakes(int a){
        speed -= 10;
        System.out.println("brake applied successfully....!");
        System.out.println("Speed is " + speed);
    }
}
public class Interfaces_1 {
    public static void main(String[] args) {
        Bicycle by = new Bicycle(200 , 4);
        Bike bi = new Bike(100 , 5);

        by.changeGear(10);
        by.speedUp(100);
        by.applyBrakes(100);
    }
}
