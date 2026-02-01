package Arrays;

import java.util.*;

public class RemoveDuplicateElementsFromAnArray {
    public static void main(String[] args) {
        int[] arr = {11,1,1,11,2,2,2,3,4,4,5,5,5,6,7,8,9,9,9};
        Arrays.sort(arr);
        System.out.println(rd(arr).toString());

    }
    public static ArrayList<Integer> rd(int []arr){
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(list.isEmpty() || list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
