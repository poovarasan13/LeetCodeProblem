class Solution {
    public int findClosestNumber(int[] nums) {
        int p=Integer.MAX_VALUE;
        int ne=Integer.MIN_VALUE;
        for(int n:nums)
        {
            if(n>=0) p=Math.min(p,n);
            else ne=Math.max(ne,n);
        }
        if(p==Integer.MAX_VALUE) return ne;
        if(ne==Integer.MIN_VALUE) return p;

        return p==Math.abs(ne) ? p :  p<Math.abs(ne) ? p:ne;
    }
}