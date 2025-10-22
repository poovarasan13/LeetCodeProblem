class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans=new int[num_people];
        int j=0;
        while(candies>0)
        {
         for(int i=0;i<num_people && candies>0;i++)
         {
            j++;
            int n=Math.min(j,candies);
            ans[i]+=n;
            candies-=n;
         }
        }
        return ans;
    }
}