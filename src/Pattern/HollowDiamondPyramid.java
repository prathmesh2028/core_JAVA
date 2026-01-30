package Pattern;

public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int n = 4;

        //upper half
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // lower half
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0 ; j <= n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++){
                if(j == 0 || j == i-1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
