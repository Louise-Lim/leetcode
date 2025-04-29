package BasicQ20;

import java.util.HashMap;

public class NumOfGoodPairs1512 {
    public static void main(String[] args) {
        NumOfGoodPairs numOfGoodPairs = new NumOfGoodPairs();
        int[] nums = {1,2,3,1,1,3};
        //int[] numsTwo = {1,1,1,1};
        System.out.println(numOfGoodPairs.numIdenticalPairs(nums));
        //System.out.println(numOfGoodPairs.numIdenticalPairs(numsTwo));
    }
}

class NumOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        int result = 0;

        for (int num : nums) {
            // obtain the 'num of occurent' of current num that have been occur
            int currentCount = countMap.getOrDefault(num, 0);
            // accumulate the 'same num of occurent' result
            result = result + currentCount;
            // update hashmap
            countMap.put(num, currentCount + 1);
        }

        return result;
    }
}
