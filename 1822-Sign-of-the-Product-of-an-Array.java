class Solution {
    public int arraySign(int[] nums) {
        int ans=1;
        for(int n:nums)
        {
            if(n==0)
               return 0;
            if(n<0)
              ans=-ans;
        }
        return ans;
    }
}