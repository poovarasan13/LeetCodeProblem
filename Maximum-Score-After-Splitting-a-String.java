class Solution {
    public int maxScore(String s) {
        int ans=0;

        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            int z_cnt=0,o_cnt=0;
            for(int j=0;j<=i;j++)
            {
                if(s.charAt(j)=='0') z_cnt++;
            }
             for(int j=i+1;j<n;j++)
            {
                if(s.charAt(j)=='1') o_cnt++;
            }
            ans=Math.max(ans,z_cnt+o_cnt);
            //   System.out.println(z_cnt+" "+o_cnt);
        }

        return ans;
    }
}