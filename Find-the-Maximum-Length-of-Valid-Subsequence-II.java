class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp=new int[k][k];
        int ans=0;

        for(int n :nums)
        {
            int x=n%k;
            for(int y=0;y<k;y++)
            {
                dp[x][y]=dp[y][x]+1;
                ans=Math.max(ans,dp[x][y]);
            }
        }
        return ans;
    }
}