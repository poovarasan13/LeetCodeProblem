class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(countDigit(nums[i])%2==0) cnt++;
        } 
        return cnt;
    }
    public int countDigit(int n)
    {
        int cnt=0;
        while(n!=0)
        {
            n=n/10;
            cnt++;
        }
        return cnt;
    }
}