package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // here by default all the values are the objects
        nums.add(2); nums.add(4); nums.add(5); nums.add(7); nums.add(99);
        System.out.println(nums);


        // here
        Iterator<Integer> value = nums.iterator();
        while(value.hasNext())
        {
            System.out.println(value.next());
        }

    }
}
