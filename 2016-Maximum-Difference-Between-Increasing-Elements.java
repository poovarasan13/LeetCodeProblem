class Solution {
    public int maximumDifference(int[] nums) {
        int len=nums.length;
        int ans=-1;
        for(int i=0;i<len-1;i++)
          {
            for(int j=i+1;j<len;j++)
            {
                if(nums[i]<nums[j])
                  ans=Math.max(ans,nums[j]-nums[i]);
            }
          }
          return ans;
    }
}