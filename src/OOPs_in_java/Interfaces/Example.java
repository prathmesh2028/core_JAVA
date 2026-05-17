package OOPs_in_java.Interfaces;


interface Computer
{
    public abstract void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code , compile and run......");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code , compile , run : fasterrrrr");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Example {
    public static void main(String[] args) {
        Computer mac = new Laptop();
        Computer desk = new Desktop();
        Developer pb = new Developer();
        pb.devApp(mac);
        pb.devApp(desk);
    }
}
