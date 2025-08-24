package BasicQ20;

import java.util.Arrays;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++) {
            // x
            result[2 * i] = nums[i];
            // y
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
