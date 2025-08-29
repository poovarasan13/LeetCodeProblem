class Solution {
    public int divisorSubstrings(int num, int k) {
        int cnt=0;
        String str=String.valueOf(num);
        int n=str.length();
        for(int i=0;i<n-k+1;i++)
        {
            int div=Integer.parseInt(str.substring(i,i+k));    
            if(div!=0 &&num%div==0) cnt++;
        }
        return cnt++;
    }
}