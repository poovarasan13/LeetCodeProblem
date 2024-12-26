class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int [] dp=new int [nums.length+1];
       return helper(nums,(nums.length)-1,target,0,dp);
    }
    public int helper(int[] nums,int i,int target,int sum,int [] dp){
   if(i<0) 
   {
    return target==sum ? 1:0;
   }
    int a=helper(nums,i-1,target,sum+nums[i],dp);
     int b=helper(nums,i-1,target,sum-nums[i],dp);
     dp[i]=a+b;
    return dp[i];
    }
}