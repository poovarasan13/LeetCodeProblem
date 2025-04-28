class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt=0,sum=0;
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            while(sum*(i-j+1)>=k)
            {
                sum-=nums[j];
                j++;
            }
            cnt+=(i-j+1);
        }
        return cnt;
    }
}