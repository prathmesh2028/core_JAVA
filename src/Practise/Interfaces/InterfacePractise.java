package Practise.Interfaces;

@FunctionalInterface
interface Shape
{
    void area();
}
class Rectangle implements Shape
{
    @Override
    public void area() {
        System.out.println("In rectangle area");
    }
}
class Circle implements Shape
{
    @Override
    public void area()
    {
        System.out.println("In circle area");
    }
}

public class InterfacePractise {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape cir = new Circle();
        rect.area();
        cir.area();
    }
}
