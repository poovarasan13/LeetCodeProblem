class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=1;
                nums[i+1]=nums[i+1]==0?1:0;
                nums[i+2]=nums[i+2]==0?1:0;
                cnt++;
            }
        }
        if(nums[n-1]==0 || nums[n-2]==0)
         return -1;
        // System.out.println(nums);
        return cnt;
    }
}