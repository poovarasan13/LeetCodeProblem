class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[n][m];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }

        return helper(n-1,m-1,dp);
    }
    public int helper(int i,int j, int [][] dp)
    {
       if(i==0 || j==0 ) return 1;
       if(dp[i][j]!=-1) return dp[i][j];

       int x= helper(i-1,j,dp);
       int y=helper(i,j-1,dp);
       return dp[i][j]=x+y;
    }
       

}