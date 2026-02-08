package OOPs_in_java.Abstraction;
abstract class TV{
    abstract void turnON();
    abstract void turnOFF();
}
class TVRemote extends TV {
    @Override
    public void turnON(){
        System.out.println("TV is turned on...");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV is turned off...");
    }
}
public class Abstraction_1 {
    public static void main(String[] args) {
        TV r = new TVRemote();
        r.turnON();
        r.turnOFF();
    }
}
