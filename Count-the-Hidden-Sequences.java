class Solution {
    public long Max(long a ,long b)
    {
        if(a>b)
           return a;
        return b;
    }
    public long Min(long a,long b)
    {
        if(a>b) return b;
        return a;
    }
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min=0,max=0,sum=0;
        for(long a:differences)
        {
            sum+=a;
            max=Max(max,sum);
            min=Min(min,sum);

        }
        long data1=lower-min;
        long data2=upper-max;
        return (int)Max(0,data2-data1+1);
    }
}