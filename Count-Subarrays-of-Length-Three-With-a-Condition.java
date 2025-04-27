class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-2;i++)
        {
            int data=nums[i]+nums[i+2],second=nums[i+1];
            if(second==data*2) cnt++;
        }
        return cnt;
    }
}