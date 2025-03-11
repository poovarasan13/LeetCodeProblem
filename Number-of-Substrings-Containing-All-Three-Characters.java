class Solution {
    public int numberOfSubstrings(String s) {
       int[] data={-1,-1,-1};
       int cnt=0,n=s.length();
       for(int i=0;i<n;i++)
       {
        data[s.charAt(i) -'a']=i;
        if(data[0]!=-1 && data[1]!=-1 && data[2]!=-1)
            cnt += (1+Math.min(data[0],Math.min(data[1],data[2])));
       }
       return cnt;
    }
}