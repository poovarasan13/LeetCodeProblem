class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] array=new int[n];
       Arrays.fill(array,-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                   array[i]=-1;
                  if(nums[i]<nums[(i+j)%n])
                  {
                    array[i]=nums[(i+j)%n];
                    break;
                  }
            }
        }
        return array;
    }
}