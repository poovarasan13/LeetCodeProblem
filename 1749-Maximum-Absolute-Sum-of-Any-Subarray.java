class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int len=nums.length;
        int sum=0,max=0,min=0;
        for(int i=0;i<len;i++)
        {    
              if(sum<0)
                sum=0;
                sum+=nums[i];
             max=Math.max(max,sum);
        }
        sum=0;
        for(int i=0;i<len;i++)
        {
            
            if(sum>0)
               sum=0;
               sum+=nums[i];
            min=Math.min(min,sum);
        }
        return Math.max(max,Math.abs(min));
    }
}