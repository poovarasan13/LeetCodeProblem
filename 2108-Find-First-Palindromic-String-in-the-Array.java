class Solution {
    public boolean pal(int i,int j,String words)
    {
        while(i<j)
        {
            if(words.charAt(i)!=words.charAt(j))
                  return false;
                  i++;
                  j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(pal(0,words[i].length()-1,words[i])) return words[i];
        }
        return ans;
    }
}