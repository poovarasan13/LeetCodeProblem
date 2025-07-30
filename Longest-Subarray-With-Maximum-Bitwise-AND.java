class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i:nums)
        {
           max=Math.max(max,i);
        }
        int len=0,curr=0;
        for(int i:nums)
        {
            if(i==max)
            {
                curr++;
                len=Math.max(len,curr);
            }
            else{
                curr=0;
            }
        }
        return len;
    }
}