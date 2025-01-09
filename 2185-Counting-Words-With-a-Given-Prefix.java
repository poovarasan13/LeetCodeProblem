class Solution {
    public boolean check(String a,String b)
    {
        return a.startsWith(b);
    }
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        int len=words.length;
        for(int i=0;i<len;i++)
        {
            if(check(words[i],pref))
             cnt++;
        }
        return cnt;
    }
}