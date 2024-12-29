class Solution {
    public int removeElement(int[] nums, int val) {
       int i,c=0,n=nums.length,j=0;
      // int [] arr=new int[n];
       for(i=0;i<n;i++)
       {
        if(nums[i]!=val)
        {
            nums[j]=nums[i];
            j++;
        }
       }

       return j;

    }
}