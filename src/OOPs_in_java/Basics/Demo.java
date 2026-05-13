package OOPs_in_java.Basics;
class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }

    public String getMeAPen(int coast)
    {
        if(coast >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}
public class Demo {
    public static void main(String[] args)
    {
        Computer cmp = new Computer();
        cmp.playMusic();
        System.out.println(cmp.getMeAPen(5));;
    }
}
