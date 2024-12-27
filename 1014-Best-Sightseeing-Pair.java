class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length,max=values[0],ans=0;
        for(int i=1;i<n;i++)
        {
           ans=Math.max(ans,max+values[i]-i);
           max=Math.max(max,values[i]+i);
        }
        return ans;
    }
}