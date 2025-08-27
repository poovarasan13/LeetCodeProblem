class Solution {
    public int balancedStringSplit(String s) {
        int c=0,cnt=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='R') c++;
            else c--;
            if(c==0) cnt++;
        }
        return cnt;
    }
}