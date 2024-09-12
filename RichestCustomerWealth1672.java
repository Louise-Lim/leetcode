public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] account = {{1, 5}, {7, 3}, {3, 5}};
        int result = maximumWealthSecondFunct(account);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static int maximumWealthSecondFunct(int[][] account) {
        int maxAmountSoFar = 0;
        for (int[] customer : account) {
            int currentTotalAmount = 0;
            for (int bankAmount : customer) {
                currentTotalAmount = currentTotalAmount + bankAmount;
            }
            maxAmountSoFar = Math.max(maxAmountSoFar, currentTotalAmount);
        }

        return maxAmountSoFar;
    }
}
