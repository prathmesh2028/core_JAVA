package Practise.Interfaces;
interface Payment
{
    void pay();
}

class UPI implements Payment
{
    public void pay() {
        System.out.println("Paying through the UPi method :)");
    }
}

class CreditCard implements Payment
{
    public void pay()
    {
        System.out.println("Paying through the credit card");
    }
}
class Cash implements Payment
{
    public void pay()
    {
        System.out.println("Paying through the cash");
    }
}

public class Interface_2 {
    public static void main(String[] args) {
        Payment c = new Cash();
        Payment cd = new CreditCard();
        Payment upi = new UPI();

        c.pay();
        cd.pay();
        upi.pay();
    }
}
