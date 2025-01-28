class Solution {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        return (nums[0]<nums[len-1]) ?increasing(nums):decreasing(nums);
    }
    public boolean increasing(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(!(nums[i-1]<=nums[i]))
                   return false;
        }
        return true;
    }
    public boolean decreasing(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(!(nums[i-1]>=nums[i]))
                return false;
        }
        return true;
    }
}