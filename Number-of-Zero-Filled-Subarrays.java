class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0,sub=0;
        for(int n:nums)
        {
            if(n==0)
               sub++;
            else
               sub=0;
            cnt+=sub;
        }
        return cnt;
    }
}