package BasicQ20;

public class FriendAppropriateAge825 {
    public static void main(String[] args) {
        FriendAppropriateAge825 friendAppropriateAge825 = new FriendAppropriateAge825();
        int[] age = {16, 16};
        System.out.println(friendAppropriateAge825.numFriendRequest(age));
    }

    public int numFriendRequest(int[] ages) {
        int[] counts = new int[121];
        for (int age : ages) counts[age]++;
        
        int totalRequests = 0;
        for (int ageX = 15; ageX <= 120; ageX++) {
            
            if (counts[ageX] == 0) continue;

            int min = (int)(0.5 * ageX + 7);
            for (int ageY = min + 1; ageY <= ageX; ageY++) {
                
                if (counts[ageY] == 0) continue;

                // Condtion
                if (!(ageY <= 0.5 * ageX + 7 || (ageY > 100 && ageX < 100))) {
                    // ageX send request to ageY
                    if (ageX == ageY) {
                        totalRequests = totalRequests + (counts[ageX] * (counts[ageX] - 1));
                    } else {
                        totalRequests += counts[ageX] * counts[ageY];
                    }
                }
            }
        }

        return totalRequests;
    }
}
