class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++)
        {
            boolean temp=true;
            if(i-k>=0)
            {
                if(nums[i]<=nums[i-k])
                {
                    temp=false;
                }
            }
            if(i+k<n)
            {
                if(nums[i]<=nums[i+k])
                     temp=false;
            }
            if(temp)
               sum+=nums[i];
        }
        return sum;
    }
}