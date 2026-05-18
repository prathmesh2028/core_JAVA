package Exception_Handling.Exceptions;

public class ArrayBoundsException {
    public static void main(String[] args) {
        int nums[] = new int[5];

        try
        {
            System.out.println(nums[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bounds");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
