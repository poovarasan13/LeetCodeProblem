class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int [][] dp=new int[m][n];
        for(int [] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return helper(m-1,n-1,grid,dp);
    }
    public int helper(int i,int j,int[][] grid,int [][] dp)
    {
        if(i==0 && j==0 ) return grid[i][j];
        int min=Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i>0)
        {
            min=Math.min(min,grid[i][j]+helper(i-1,j,grid,dp));
        }
        if(j>0) 
           min=Math.min(min,grid[i][j]+helper(i,j-1,grid,dp));
       

        return dp[i][j]=min;
    }
}