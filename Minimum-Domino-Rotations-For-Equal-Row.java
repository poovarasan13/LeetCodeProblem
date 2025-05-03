class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++)
        {
            res=Math.min(res,getRotations(tops,bottoms,i));
            res=Math.min(res,getRotations(bottoms,tops,i));            
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int getRotations(int[] top ,int[] bottom,int t)
    {
        int cnt=0;
        for(int i=0;i<top.length;i++)
        {
            if(top[i]==t) continue;
            if(bottom[i]==t) cnt++;
            else return Integer.MAX_VALUE;
        }
       return cnt;
    }
}