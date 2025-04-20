class Solution {
    public int Count(String str)
    {
        int n=str.length();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='1')
              cnt++;
        }
        return cnt;
    }
    public int Binary(int n)
    {
        String str=\\;
        while(n!=0)
        {
            str=n%2+str;
            n=n/2;
        }
        int count=Count(str);
        return count;
    }
    public int[] countBits(int n) {
        int[] array=new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            array[i]=Binary(i);
        }
        return array;
    }
}