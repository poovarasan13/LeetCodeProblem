class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] arr=new int[n+1];
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1];
            if((nums[i-1]&1)==(nums[i]&1))
            {
                arr[i]++;
                // System.out.println(arr[i]);
            }
            
        }
        boolean[] answer=new boolean[queries.length];
        for(int i=0;i<queries.length;i++)
        {
          
            int s=queries[i][0];
            int e=queries[i][1];
            int ans=arr[e]-(s>0? arr[s]:0);
            answer[i]=(ans==0);
             
        }
        return answer;

    }
}