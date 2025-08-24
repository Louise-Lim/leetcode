package BasicQ20;

public class SubtractProductAndSum1281 {
    public static void main(String[] args) {
        int result = subtractProductAndSum(234);
        System.out.println(result);
    }   

    public static int subtractProductAndSum (int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        
        return sum;
    }
}
