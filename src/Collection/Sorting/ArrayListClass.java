package Collection.Sorting;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(1);
        nums.add(9);
        nums.add(44);
        nums.add(14);
        nums.add(12);

        Collections.sort(nums ,  c);
        System.out.println(nums);
    }
}
