class Solution {
    public int minimumDifference(int[] nums, int k) {
        int len=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0,j=k-1;j<len;i++,j++)
        {
            min=Math.min(min,nums[j]-nums[i]);
        }
         return min;
    }
}