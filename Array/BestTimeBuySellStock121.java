package Array;

public class BestTimeBuySellStock121 {
    public static void main(String[] args) {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        int[] prices = { 1,2};
        System.out.println(bestTimeBuySellStock.maxProfit(prices));

    }
}

class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        // int minPrice = prices[0];
        // int minIndex = 0;
        // int maxPrice = prices[prices.length - 1];
        // int maxIndex = 0;
        // int profit = 0;

        // // find min in whole array
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < prices[i - 1] && (prices[i] < minPrice)) {
        //         minPrice = prices[i];
        //         minIndex = i; // i+1 = day 2
        //     }
        // }

        // // find max start from minIndex
        // if (minPrice != prices[prices.length - 1]) {
        //     for (int i = minIndex; i < prices.length - 1; i++) {
        //         if (prices[i] > maxPrice) {
        //             maxPrice = prices[i];
        //             maxIndex = i;
        //         }
        //     }
        // }

        // profit = maxPrice - minPrice;

        // return profit;

        int buy = prices[0]; // assume minPriceBuy is first element
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy) { // find the minimun price buy in array
                buy = prices[i];

            } else if (prices[i] - buy > profit) { // compare profit of current price, minimum price buy until the end of array
                profit = prices[i] - buy;
            }
        }

        return profit;
    }
}