package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {

//        Collection nums = new ArrayList();
//
//        // here by default all the values are the objects
//        nums.add(2); nums.add(4); nums.add(5); nums.add(7); nums.add(99);
//        System.out.println(nums);
//        for(Object e:nums) System.out.println(e);



        Collection<Integer> nums = new ArrayList<Integer>();

        // here by default all the values are the objects
        nums.add(2); nums.add(4); nums.add(5); nums.add(7); nums.add(99);
        System.out.println(nums);
        for(int e:nums) System.out.print(e + " ");

    }
}
