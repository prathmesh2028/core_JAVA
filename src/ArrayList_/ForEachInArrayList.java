package ArrayList_;

import java.util.ArrayList;

public class ForEachInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.forEach(x -> System.out.print(x + " "));
    }
}
