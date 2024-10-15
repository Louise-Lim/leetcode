package Array;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

class RotateArray {
    public void rotate(int[] nums, int k) {
        // Handle cases where k is larger than the array size
        k = k % nums.length;

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest of the array
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
