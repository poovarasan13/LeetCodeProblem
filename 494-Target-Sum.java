class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return helper(nums,(nums.length)-1,target,0);
    }
    public int helper(int[] nums,int i,int target,int sum){
   if(i<0) 
   {
    return target==sum ? 1:0;
   }
   
    int a=helper(nums,i-1,target,sum+nums[i]);
     int b=helper(nums,i-1,target,sum-nums[i]);
    return a+b;
    }
}