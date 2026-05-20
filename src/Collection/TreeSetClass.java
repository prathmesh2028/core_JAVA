package Collection;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

        //Treeset always keeps the values in ascending order
        Collection<Integer> ts = new TreeSet<Integer>();
        ts.add(2);ts.add(5);ts.add(77);ts.add(235);ts.add(123);
        System.out.println(ts);
    }
}
