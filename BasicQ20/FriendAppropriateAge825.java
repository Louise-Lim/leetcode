package BasicQ20;

public class FriendAppropriateAge825 {
    public static void main(String[] args) {
        FriendAppropriateAge825 friendAppropriateAge825 = new FriendAppropriateAge825();
        int[] age = {16, 16};
        System.out.println(friendAppropriateAge825.numFriendRequest(age));
    }

    public int numFriendRequest(int[] ages) {
        int[] counts = new int[121];
        for (int age : ages) {
            counts[age]++;
        }

        int totalRequests = 0;
        // 遍历所有可能的发送者年龄 ageX
        // 从 15 岁开始循环，因为 14 岁及以下的人不会发送请求 (见上面的优化说明)。
        for (int ageX = 15; ageX <= 120; ageX++) {
            if (counts[ageX] == 0) {
                continue;
            }

            for (int ageY = 1; ageY <= 120; ageY++) {
                if (counts[ageY] == 0) {
                    continue;
                }

                // Condtion
                if (!(ageY <= 0.5 * ageX + 7 || ageY > ageX || (ageY > 100 && ageX < 100))) {
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
