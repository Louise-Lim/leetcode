package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
*/

public class MajorityElement229 {
    public static void main(String[] args) {
        MajorityElementII majorityElementII = new MajorityElementII();
        int[] nums = { 1, 2 };

        System.out.println(majorityElementII.majorityElement(nums));
    }
}

class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);
        int size = nums.length / 3;
        int size2 = nums[size];
        if (size2 == 1) {
            size2 = nums.length;
        }

        for (int i = 0; i < size2; i++) {
            temp.add(nums[i]);
        }

        return temp;
    }
}
