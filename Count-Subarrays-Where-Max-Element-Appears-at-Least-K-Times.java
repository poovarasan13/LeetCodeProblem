class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int n:nums)
         max=Math.max(max,n);
        int cnt=0;
        long ans=0;
        int n=nums.length, j=0;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==max) cnt++;
           while(cnt>=k)
           {
            if(nums[j]==max) cnt--;
            j++;
           }
           ans+=j;
        }
        return ans;
    }
}