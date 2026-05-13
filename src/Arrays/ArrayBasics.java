package Arrays;

public class ArrayBasics {
    public static void main(String[] args)
    {
        int[] arr = {3,7,2,4};


//        System.out.println(arr[0]);
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println();

        int nums[] = new int[5];
        nums[0] = 11;
        nums[1] = 22;
        nums[2] = 33;
        nums[3] = 44;
        nums[4] = 55;

//        for(int i = 0 ; i < nums.length ; i++)
//        {
//            System.out.print(nums[i] + " ");
//        }

        // MULTIDIMENTIONAL ARRAY i.e 2D array

        int twoDArray[][] = new int [3][3];
//        twoDArray[0][0] = 22;
//        twoDArray[0][1] = 34;
//        twoDArray[0][2] = 51;
//        twoDArray[1][0] = 4;
//        twoDArray[1][1] = 53;
//        twoDArray[1][2] = 45;
//        twoDArray[2][0] = 33;
//        twoDArray[2][1] = 11;
//        twoDArray[2][2] = 55;


        for(int i = 0 ; i < twoDArray.length ; i++)
        {
            for(int j = 0 ; j < twoDArray[0].length ; j++)
            {
                twoDArray[i][j] = (int)(Math.random()*10);
            }

        }

        for(int i = 0 ; i < twoDArray.length ; i++)
        {
            for(int j = 0 ; j < twoDArray[0].length ; j++)
            {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] a : twoDArray)
        {
            for(int m : a)
            {
                System.out.print(m +  " ");
            }
            System.out.println();
        }
    }
}

// 4:12:12
