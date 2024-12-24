class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] dp=new int[n+1];
        for(int i=0;i<=n;i++) dp[i]=-1;
        return Math.min(costs(cost,n-1,dp),costs(cost,n-2,dp));
    }
    public int costs(int [] cost,int n,int []dp)
    {
       if(n==0|| n==1) {
         return cost[n];
       }
       if(dp[n]!=-1) return dp[n];
        int temp1=costs(cost,n-1,dp);
        int temp2=costs(cost,n-2,dp);
        dp[n]=cost[n]+Math.min(temp1,temp2);
        return dp[n];
    }
    
}