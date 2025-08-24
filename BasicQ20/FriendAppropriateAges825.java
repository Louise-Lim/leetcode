package BasicQ20;

import java.util.Arrays;

public class FriendAppropriateAges825 {
    public static void main(String[] args) {
        FriendAppropriateAges825 solver = new FriendAppropriateAges825();
        int[] ages = {16, 16};
        int res = solver.numFriendRequests(ages);
        System.out.println(res);

    }

    public int numFriendRequests(int[] ages) {
        int res = 0;
        Arrays.sort(ages);
        int[] count = new int[121];
        
        for (int age : ages) count[age]++;

        for (int ageA = 15; ageA <= 120; ageA++) {
            if (count[ageA] == 0) continue;
            
            int min = (int)(0.5 * ageA + 7);
            for (int ageB = min + 1; ageB <= ageA; ageB++) {
                if (count[ageB] == 0) continue;

                if (ageB > 100 && ageA < 100) continue;

                if (ageA == ageB) {
                    res += count[ageA] * (count[ageA] - 1);
                } else {
                    res += count[ageA] * count[ageB];
                }
            }
        }

        return res;
    }
}
