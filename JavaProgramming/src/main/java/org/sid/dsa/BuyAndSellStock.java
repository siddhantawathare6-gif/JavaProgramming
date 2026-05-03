package org.sid.dsa;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int max = maxProfit(prices);
        System.out.println(max);
        
    }

    private static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min>prices[i]){
                min=prices[i];
            }
            int todayProfit = prices[i] - min;
            if (todayProfit>profit){
                profit=todayProfit;
            }
        }
        return profit;
    }
}
