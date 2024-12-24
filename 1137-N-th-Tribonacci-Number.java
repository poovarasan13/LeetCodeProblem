class Solution {
    public int tribonacci(int n) {
        int [] dp=new int[n+1];
        return tri(n,dp);
    }
     public int tri(int n,int [] dp){
        if(n==0 ) return 0;
        if( n==1 || n==2 ) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=tri(n-1,dp)+tri(n-2,dp)+tri(n-3,dp);
        return dp[n];
    }
}