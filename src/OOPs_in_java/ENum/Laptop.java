package OOPs_in_java.ENum;

enum Laptop1
{
    Victus(2000) , HP(2200) , DELL(1500) , Macbook(1800) , Surface , Thinkpad (1030), XPS(5000);

    private int price;
    private Laptop1(int price)
    {
        this.price = price;
        System.out.println(" in laptop " + this.name());
    }

    Laptop1() {
        this.price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Laptop {
    public static void main(String[] args) {
        Laptop1 lap = Laptop1.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop1 l : Laptop1.values())
        {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
