class Solution {
    public boolean isPali(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<=1) return s;
        int start=0,ans=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                    if((j-i+1)>ans && isPali(s,i,j) )
                    {
                        start=i;
                        ans=(j-i+1);
                    }
            }
        }
// System.out.println(start+" "+ans);
        return s.substring(start,start+ans);
    }
}