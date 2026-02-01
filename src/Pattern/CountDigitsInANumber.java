package Pattern;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        int n = 234567;
        int digit = 0;
        while(n > 0){
            digit ++;
            n /= 10;
        }
        System.out.println(digit);
    }
}
