package Array;

import java.util.Arrays;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */

public class MajorityElement169 {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 11,16,11,11,16 };
        //majorityElement.majorityElement(nums);
        System.out.println(majorityElement.majorityElement(nums));
    }
}

class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0; //assume index 0 is majority element

        for (int element : nums) {

            if (count == 0) {
                candidate = element;
            }

            if (element == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);

        return candidate;

        // Arrays.sort(nums);
        // return nums[nums.length / 2];
    }
}
