class Solution {
    public long countSubstrings(String s, char c) {
        long cnt=0,ans=0;
        for(char ch:s.toCharArray())
        {
            if(ch==c){
               cnt++;
               ans+=cnt;
            }
        }
        // if(cnt==1) return cnt;
        return ans;
    }
}