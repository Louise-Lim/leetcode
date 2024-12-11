package TwoPointer;

import java.util.Arrays;

public class TwoSum167 {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] nums = { 2, 7, 11, 15 };
        int[] result = twoSumII.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}

class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        // time complexity: o(n)
        // space complexity: o(1)

        int indexL = 0;
        int indexR = numbers.length - 1;

        while (indexL < indexR) {
            int sum = numbers[indexL] + numbers[indexR];
            
            if (sum == target) {
                return new int[] { indexL + 1, indexR + 1 }; // index need start from 1
            }

            if (sum > target) {
                indexR--;
            } else {
                indexL++;
            }
        }

        return new int[0];
    }
}