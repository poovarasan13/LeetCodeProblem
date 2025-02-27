class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int a:arr)
              set.add(a);
        int answer=0,n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int first=arr[i];
                int second=arr[j];
                int sum=first+second;
                int cnt=2;
                while(set.contains(sum))
                {
                    first=second;
                    second=sum;
                    sum=first+second;
                    cnt++;
                }
                answer=Math.max(answer,cnt);
            }
        }
        return answer==2 ? 0 :answer;
    }
}