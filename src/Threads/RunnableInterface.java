package Threads;
class P implements Runnable
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
class Q implements Runnable
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
public class RunnableInterface {
    public static void main(String[] args) {
        P obj1 = new P();
        Q obj2 = new Q();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
