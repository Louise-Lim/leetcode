package BasicQ20;

public class PowerOftwo231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }
}
