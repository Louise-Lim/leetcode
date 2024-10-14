package Array;

import java.util.Arrays;

public class RemoveDuplicateArray80 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 2, 2, 3 };

        RemoveDuplicateArrayII removeDuplicateArrayII = new RemoveDuplicateArrayII();
        removeDuplicateArrayII.removeDuplicates(nums);
    }
}

class RemoveDuplicateArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int n : nums) {
            if (k < 2 || n != nums[k - 2]) {
                nums[k++] = n;
            }
        }


        // handle unwanted
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        System.out.println(k + " , " + Arrays.toString(temp));

        return k;
    }
}