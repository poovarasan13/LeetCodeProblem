class Solution {
    public long coloredCells(int n) {
        if(n==1)
         return 1;
         long ans=((long)n*n +(long)(n-1 )*(n-1));
        return ans;
    }
}