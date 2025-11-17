class Solution {
    public boolean kLengthApart(int[] nums, int k) {
      
      int idx=-1;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==1 && idx!=-1)
        {
            if(i-idx-1<k) return false;
            // System.out.println(i-idx);
        }
        if(nums[i]==1)
        {
            idx=i;
        }
      }
      return true;
    }
}