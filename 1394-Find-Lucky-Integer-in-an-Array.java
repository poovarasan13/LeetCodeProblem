class Solution {
    public int findLucky(int[] arr) {
        int max=0;
        for(int a:arr)
        {
            if(max<a) max=a;
        }
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int cnt=-1;
        for(int i=1;i<=max;i++)
        {
            if(freq[i]==i)
               cnt=i;
        }
        return cnt;
    }
}