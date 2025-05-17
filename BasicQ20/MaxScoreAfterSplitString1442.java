package BasicQ20;

public class MaxScoreAfterSplitString1442 {
    public static void main(String[] args) {
        MaxScoreAfterSplitString1442 maxScoreAfterSplitString1442 = new MaxScoreAfterSplitString1442();
        String s = "011101";
        int result = maxScoreAfterSplitString1442.maxScore(s);
        System.out.println(result);
    }

    public int maxScore(String s) {
        
        int totalOne = 0;
        for (char c: s.toCharArray()) {
            if (c == '1') {
                totalOne++;
            }
        }

        int numLeftZero = 0;
        int numLeftOne = 0;
        int maxScore = 0;
        // i = seperator
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                numLeftZero++;
            } else {
                numLeftOne++;
            }

            int score = numLeftZero + (totalOne - numLeftOne);
            if (score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
    }
}
