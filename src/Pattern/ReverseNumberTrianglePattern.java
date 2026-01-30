package Pattern;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0 ; i < n ; i++){
            for(int j = n-i-1 ; j < n ; j++){
                System.out.print(" ");
            }
            for(int j = i+1 ; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
