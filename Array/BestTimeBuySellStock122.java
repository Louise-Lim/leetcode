package Array;

public class BestTimeBuySellStock122 {
    public static void main(String[] args) {
        BestTimeBuySellStockII bestTimeBuySellStockII = new BestTimeBuySellStockII();
        int[] prices = {7,1,5,3,6,4};
        int totalProfit = bestTimeBuySellStockII.maxProfit(prices);
        System.out.println(totalProfit);
    }
}

class BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        // we need at least 2 days to find the profit
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // check if we can profit with previous day's price
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get total profit
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                totalProfit = totalProfit + profit;
            }
        }
        return totalProfit;
    }
}