class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int ans=Integer.MIN_VALUE;
        int n=energy.length;
        for(int i=n-k;i<n;i++)
        {
            int sum=0;
            for(int j=i;j>=0;j-=k)
            {
                sum+=energy[j];
                  if(ans<sum)ans=sum;
            }
          
        }
        return ans;
    }
}