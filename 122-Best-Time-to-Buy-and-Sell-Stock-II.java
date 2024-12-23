class Solution {
    public int maxProfit(int[] prices) {
        int sum=0,len=prices.length;
        for(int i=1;i<len;i++)
        {
            if(prices[i]>prices[i-1])
            {
                sum=sum+(prices[i]-prices[i-1]);
            }
        }
        return sum;
    }
}