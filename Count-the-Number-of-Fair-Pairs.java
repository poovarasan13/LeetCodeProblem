class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return Pairs(nums,upper)-Pairs(nums,lower-1);
    }
    public long Pairs(int[] nums,int k)
    {
        int i=0,j=nums.length-1;
        long ans=0;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(k>=sum)
            {
             ans+=(j-i);
            i++;
            }
            else{
            j--;
            }
        }
        return ans;
    }
}