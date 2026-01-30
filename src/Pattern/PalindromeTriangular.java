package Pattern;
/*
   1
  212
 32123
4321234
 */
public class PalindromeTriangular {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
