package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetHashSetClass {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        // here by default all the values are the int
        // no duplicate elements in set
        nums.add(2); nums.add(4); nums.add(5); nums.add(7); nums.add(99);
        System.out.println(nums);
        for(int e:nums) System.out.print(e + " ");
    }
}
