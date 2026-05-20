package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        // here by default all the values are the int
        nums.add(2); nums.add(4); nums.add(5); nums.add(7); nums.add(99);
        System.out.println(nums);
        for(int e:nums) System.out.print(e + " ");
        System.out.println();
        System.out.println(nums.indexOf(7));
    }
}
