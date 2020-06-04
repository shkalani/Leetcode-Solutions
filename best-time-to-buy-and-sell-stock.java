class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)    return 0;
        int minPrice = prices[0];
        int maxProfit = 0;

        
        for(int i = 1 ; i<prices.length ; i++){
            int currentPrice = prices[i];
            int currentProfit = currentPrice-minPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
            minPrice = Math.min(currentPrice, minPrice);
        }
        return maxProfit;
        
    }
}
