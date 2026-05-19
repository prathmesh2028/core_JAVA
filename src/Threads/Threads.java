package Threads;

class A extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("HI ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("HELLO ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

    }
}
