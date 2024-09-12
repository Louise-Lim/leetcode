package SlidingWindow;
/**
 * MinimumSizeSubarraySum 209
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray,
 * return 0 instead.
 * 
 * Example 1:
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * Example 2:
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinimumSizeSubarraySum209 {
    public static void main(String[] args) {

        int result = minSubArrayLen(0, 0, Integer.MAX_VALUE, 0, 7, new int[] { 2, 3, 1, 2, 4, 3 });

        System.out.println(result);
    }

    public static int minSubArrayLen(int L, int R, int min, int sum, int target, int[] nums) {
        while (R < nums.length) {
            sum += nums[R];
            while (target <= sum) {
                min = Math.min(min, R - L + 1);
                sum -= nums[L];
                L++;
            }
            R++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}