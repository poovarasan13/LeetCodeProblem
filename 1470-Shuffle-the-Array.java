class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j=0,l=nums.length;
        int [] result=new int[l];
        for(i=0;i<n;i++)
        {
            result[j++]=nums[i];
            result[j++]=nums[i+n];
        }
        return result;
    }
}