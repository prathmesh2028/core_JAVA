package Basics.Generics;
class Printer <T> {
    T thingToprint;

    public Printer(T thingToprint) {
        this.thingToprint = thingToprint;
    }

    public void print() {
        System.out.println(thingToprint);
    }
}
public class Printing_Deo {
    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(44);
        p.print();

        Printer<String> q = new Printer<>("Hello world");
        q.print();

        Printer<Double> r = new Printer<>(445.6546);
        r.print();
    }
}
