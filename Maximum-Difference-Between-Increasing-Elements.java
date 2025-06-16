class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length,max=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                max=Math.max(max,(nums[j]-nums[i]));
            }
        }
        return max;
    }
}