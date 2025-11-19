class Solution {
    public int dominantIndex(int[] nums) {
         int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
         int i1=-1,i2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(a<nums[i]){
                // i2=i1;
                i1=i;
                b=a; 
                a=nums[i];
            }

            else if(b<nums[i] && nums[i]!=a)
            {
                b=nums[i];
                // i2=i;
            }
        }
           if(a>=(b*2))
           {
             return i1;
           }
          return -1;
    }
}