class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,sum=0,n=gain.length;
        for(int i=0;i<n;i++)
        {
            sum+=gain[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}