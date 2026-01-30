package Arrays;
import java.awt.Point;
import java.util.Arrays;

public class ArrayOfPointersInJava {
    public static void main(String[] args) {
        Point [] a = {new Point(10,20) , new Point(3,4) , new Point(44,21)};
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
