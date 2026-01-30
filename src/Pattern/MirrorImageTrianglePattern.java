package Pattern;

public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int n = 4;

        // upper half
        for(int i = 0 ; i < n ; i++){
            for(int j = n-i-1 ; j < n-1 ; j++){
                System.out.print(" ");
            }
            for(int j = i+1 ; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // lower half
        for(int i = 1 ; i < n ; i++){
            for(int j = n-i-1 ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int j = n-i ; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
