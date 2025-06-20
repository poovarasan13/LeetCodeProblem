class Solution {
    public int maxDistance(String s, int k) {
        int n=s.length();
        int max=0;
        int north=0,south=0,east=0,west=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='N')  north++;
            else if(ch=='W') west++;
            else if(ch=='E') east++;
            else south++;
            int x=Math.abs(north-south);
            int y=Math.abs(east-west);
            int dist=x+y;
            int ans=dist+Math.min(2*k,i+1-dist);
            max=Math.max(max,ans);
        }
        return max;
    }
}