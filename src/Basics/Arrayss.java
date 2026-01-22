package Basics;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
        int [] numbers = {2,4,23,1,1,4,5,6};
        System.out.println(numbers.length);
        // sorting the array
        Arrays.sort(numbers);
        numbers[0] = 1;
        numbers[1] = 99;
        System.out.println(Arrays.toString(numbers));
    }
}
