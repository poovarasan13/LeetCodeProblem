class Solution {
    public int countPairs(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            for(int j=i+1;j<n;j++)
            {
                int b=nums[j];
                // if(a==b)
            //    System.out.println(a+" " +b +" "+(i*j)%k );
                if(a==b  && ((i*j)%k ==0))
                {
                     
                    cnt++;

                }
            }
        }
        return cnt;
    }
}