class Solution {
    public int countLargestGroup(int n) {
        int cnt=0;
       int[] freq=new int[50];
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int data=sumDigit(i);
            freq[data]++;
            int val=freq[data];
            if(max<val)
               max=val;
        }
       for(int i=0;i<50;i++)
        {
            if(freq[i]==max) cnt++;
        }
        return cnt;
    }
    public int sumDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        // System.out.println(sum);
        return sum;
    }
}