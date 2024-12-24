class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return helper(nums,0,dp);
        
    }
    public int helper(int [] nums,int idx,int [] dp)
    {
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
            
         int pick=nums[idx]+ helper(nums,idx+2,dp);
        int nextpick=helper(nums,idx+1,dp);
        dp[idx]=Math.max(pick,nextpick);
        return dp[idx];
    }
}