import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> tempArray = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                tempArray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                tempArray.add("Fizz");
            } else if (i % 5 == 0) {
                tempArray.add("Buzz");
            } else {
                tempArray.add(String.valueOf(i));
            }
        }
        return tempArray;
    }
}
