package BasicQ20;

public class MaxScoreAfterSplitString1422 {
    
    public static void main(String[] args) {
        MaxScoreAfterSplitString1422 solver = new MaxScoreAfterSplitString1422();
        int res = solver.maxScore("00111");
        System.out.println(res);
    }
    
    public int maxScore(String s) {
        int totalNumOne = 0;
        int numRightZero = 0;
        int numRightOne = 0;
        int maxScore = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalNumOne++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 0) {
                numRightZero++;
            } else {
                numRightOne++;
            }

            int score = numRightZero + (totalNumOne - numRightOne);
            if (score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
    }
}
