class Solution {
    public int maximumCount(int[] nums) {
        int pos_count=0,neg_count=0,count=0;
        int i;
        for(int a:nums)
        {
            if(a>0) pos_count++;
            if(a<0) neg_count++;
        }
        if(pos_count>=neg_count)
        {
            count=pos_count;
        }
        else{
            count=neg_count;
        }
        return count;
    }
}