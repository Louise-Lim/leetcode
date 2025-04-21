/*
Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n. 

Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.

*/

/*
1. 
n = 5 (odd)
constant = 2
result = 5 * 2 (multiply)

2.
n = 6 (even)
constant = 2
result = 6 (return the variable pass in)
 */

package BasicQ20;

public class SmallestEvenMultiple2413 {
    public static void main(String[] args) {
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        System.out.println(smallestEvenMultiple.smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple.smallestEvenMultiple(6));
    }
}

class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        // 5 << 1 
        // = 5 * 2^1
        // = 10

        // 6 << 0
        // = 6 * 2^0
        // = 6
        return n << (n & 1);
    }
}
