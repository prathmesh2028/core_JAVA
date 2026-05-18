package Practise.Interfaces;

interface Printer
{
    void print();
}
interface Scanner
{
    void scan();
}
class AllInOneMachine implements Printer , Scanner
{
    public void print(){
        System.out.println("Printing through the printer");
    }
    public void scan()
    {
        System.out.println("Scanning through the scanner");
    }
}

public class Q {
    public static void main(String[] args) {
        Printer p = new AllInOneMachine();
        Scanner s = new AllInOneMachine();

        p.print();
        s.scan();
    }
}
