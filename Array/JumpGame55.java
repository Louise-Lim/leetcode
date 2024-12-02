package Array;

public class JumpGame55 {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] num = { 3, 2, 1, 0, 4 };
        Boolean result = jumpGame.canJump(num);
        System.out.println(result);
    }
}

class JumpGame {
    public Boolean canJump(int[] num) {
        int reachable = 0;
        
        for (int i = 0; i < num.length; i++) {
            if (i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + num[i]);
        }

        return true;
    }
}
