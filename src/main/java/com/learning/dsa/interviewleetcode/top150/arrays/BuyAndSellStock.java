package com.learning.dsa.interviewleetcode.top150.arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) return 0;

        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < len; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit,prices[i] - buyPrice);
        }
        return profit;
    }
}
