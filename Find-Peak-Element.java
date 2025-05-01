class Solution {
    public int findPeakElement(int[] nums) {
        return binary(nums,0,nums.length-1);
    }
    public int binary(int[] nums,int i,int j)
    {
        while(i<j)
        {
            int mid=(i+j)/2;
            if(nums[mid]>nums[mid+1]) j=mid;
            else i=mid+1;
        }
        return i;
    }
}