package Arrays;

public class ForEachLoop {
    public static void main(String[] args)
    {
        int[] arr = new int [5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = i+1;
        }

        // normal for loop
//        for(int i = 0 ; i < arr.length ; i++) System.out.println(arr[i]);

        // for each loop

        for(int e: arr) System.out.print(e + " ");
    }
}
