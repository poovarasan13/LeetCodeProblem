class Solution {
    public int hammingDistance(int x, int y) {
        int[] bit1=new int[32];
        int[] bit2=new int[32];
        bitconvert(bit1,x);
        bitconvert(bit2,y);
        int cnt=0;
        for(int i=0;i<32;i++)
        {
            if(bit1[i]!=bit2[i]) cnt++;
    //    System.out.println(bit1[i]+" "+bit2[i]);
        }
        return cnt;
    }
    public void bitconvert(int[] bit,int n)
    {
        int j=0;
        while(n>0)
        {
            bit[j++]=n%2;
            n=n/2;
        }

    }
}