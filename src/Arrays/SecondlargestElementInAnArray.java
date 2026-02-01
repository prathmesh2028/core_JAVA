package Arrays;

public class SecondlargestElementInAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            max = Math.max(max , a[i]);
        }
        System.out.println(max);

        //finding the second max
        for(int i = 0 ; i < a.length ; i++){
            if(max != a[i] && smax <
                    a[i]) smax = a[i];
        }
        System.out.println(smax);
    }
}
