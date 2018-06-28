class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1,j=0;i<prices.length;i++,j++){
            if(prices[j]<prices[i])
                max += prices[i]-prices[j];
        }
        return  max;

    }
}
