package OOPs_in_java.Abstraction;

import static java.lang.Math.PI;

interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public double calculateArea(){
        return PI * r * r;
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;
    Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class Interface {
    public static void main(String[] args) {
        Shape cir = new Circle(5.0);
        Shape rect = new Rectangle(4.0 , 6.0);

        System.out.println(cir.calculateArea());
        System.out.println(rect.calculateArea());
    }
}
