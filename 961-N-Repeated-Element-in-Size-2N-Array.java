class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int a:nums)
        {
            max=Math.max(a,max);
        }
        int[] freq=new int[max+1];
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<max+1;i++)
        {
            if(freq[i]>1)
             return i;
        }
        return 0;
    }
}