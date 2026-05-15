package OOPs_in_java;

abstract class Car
{
    abstract void drive();
    public void playMusic()
    {
        System.out.println("Playing music.....!");
    }
}
class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving the wagonR car");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        WagonR obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
