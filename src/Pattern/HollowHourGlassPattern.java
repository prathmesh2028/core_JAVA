package Pattern;

public class HollowHourGlassPattern {
    public static void main(String[] args) {
        int n = 5;

        // upper half
        for(int i = 0 ; i < n ; i++){
            for(int j = n-i ; j < n ; j++){
                System.out.print(" ");
            }
            for(int j = i+1 ; j <= n ; j++){
                if(j == i+1 || j == n || i == 0){
                    System.out.print(" *");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        // lower half side
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i || i == (n-1)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
