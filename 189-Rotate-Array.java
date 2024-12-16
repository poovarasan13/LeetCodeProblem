class Solution {
    public void rotate(int[] nums, int k) {
        int i=0,n=nums.length;
        int []arr=new int[n];
        k=k%n;
        for(i=0;i<n;i++)
        {
            arr[(i+k)%n]=nums[i];
        }
        i=0;
        for(int p:arr)
        {
            nums[i++]=p;
        }
      // return arr;
    }
}