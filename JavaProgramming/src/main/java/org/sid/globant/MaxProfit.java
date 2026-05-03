package org.sid.globant;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//prices = [7,1,5,3,6,4]

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit= profit(prices);
        System.out.println(maxProfit);
    }

    private static int profit(int[] prices) {
        int minStockPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices){
            if (minStockPrice>price){
                minStockPrice=price;
            }
            int todayProfit = price - minStockPrice;

            if (todayProfit>profit){
                profit=todayProfit;
            }
        }
        return profit;
    }
}
