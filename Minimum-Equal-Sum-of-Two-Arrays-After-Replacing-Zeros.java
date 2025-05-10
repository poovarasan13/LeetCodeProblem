class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,zero1=0,zero2=0;
        for(int n:nums1)
        {
            if(n==0) zero1++;
            sum1+=n;
        }
        for(int n:nums2)
        {
            if(n==0) zero2++;
            sum2+=n;
        }
        if(zero1==0 && zero2==0)
        {
           return sum1==sum2?sum2:-1; 
        }
        else if(zero1==0)
        {
            return sum2+zero2<=sum1?sum1:-1;
        }
         else if(zero2==0)
        {
            return sum1+zero1<=sum2?sum2:-1;
        }
        return Math.max(sum1+zero1,sum2+zero2);
    }
}