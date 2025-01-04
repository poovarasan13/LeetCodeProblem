class Solution {
    public boolean pal(int i,int j,String s)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len=s.length();
        int start=0;
        int end=1;
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                if(pal(i,j,s)&&(j-i+1)>end)
                {
                     start=i;
                     end=(j-i+1);
                }
            }
        }
        return s.substring(start,start+end);
    }
}