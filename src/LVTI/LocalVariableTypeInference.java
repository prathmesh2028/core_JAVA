package LVTI;

public class LocalVariableTypeInference {
    public static void main(String[] args) {
        int a = 9;
        var b = 8; // java automatically understands that it is int



        int c; // at least we know its type
        var d = 10;


        int nums[] = new int[10];
        var num = new int[10];


    }
}
