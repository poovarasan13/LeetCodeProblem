class Solution {
    public List<Integer> div(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                ans.add(i);
                if(ans.size()>4) break;
        }
        return ans;
    }
  public int helper(int[] nums,int[] dp,int sum)
  {
    
          for (int a : nums) {
            if(dp[a]!=-1)
            {
                sum=sum+dp[a];
            }
            else{
            List<Integer> ans = div(a);
            if (ans.size() == 4) {
            int val=0;
                for (int i = 0; i < 4; i++) {
                    val += ans.get(i); // System.out.print(ans.get(i)+" ");
                }
                dp[a]=val;
                sum+=val;
            }}

        }
        return sum;
  }
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        int[] dp=new int[100009];
        Arrays.fill(dp,-1);
        return helper(nums,dp,sum);
    }
}