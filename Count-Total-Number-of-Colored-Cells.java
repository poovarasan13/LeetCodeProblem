class Solution {
    public long coloredCells(int n) {
        if(n==1)
         return 1;
         
        return ((long)n*n +(long)(n-1 )*(n-1));
    }
}