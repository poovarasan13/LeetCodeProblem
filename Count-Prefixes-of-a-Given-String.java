class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(String str:words)
        {
            if(s.startsWith(str))
            {
                cnt++;
            }
        }
        return cnt++;
    }
}