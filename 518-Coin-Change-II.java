class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return helper(coins,amount,n-1,dp);
    }
    public int helper(int[] coins,int amount,int i,int[][] dp)
    {
        if(amount==0)  return 1;
        if(amount<0 || i<0 ) return 0;
        if(dp[i][amount]!=-1)
           return dp[i][amount];
        int pick=0;
        int notpick=0;
        if(amount-coins[i]>=0)
             {
                pick+=helper(coins,amount-coins[i],i,dp);
             }
             notpick+=helper(coins,amount,i-1,dp);
             dp[i][amount]=pick+notpick;
        return dp[i][amount];
    }
}