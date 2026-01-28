package ArrayList_;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInJava {
    public static void main(String[] args) {
        // forward traversl
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> li =  list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        // reverse traversal
//        ListIterator<Integer> li =  list.listIterator(list.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
