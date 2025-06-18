class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int cnt=0;
        for(char ch:word.toCharArray())
        {
            if(ch>='A' && ch<='Z')
              cnt++;
        }
        char c=word.charAt(0);
        if(cnt==0 || (cnt==1&& (c>='A' && c<='Z')) || cnt==n) return true;
        return false; 
    }
}