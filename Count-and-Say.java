class Solution {
    public String countAndSay(int n) {
        String str="1";
        for(int i=2;i<=n;i++)
        {
            str=count(str);
        }
        return str; 
    }
    public String count(String s)
    {
         String str="";
         int n=s.length();
         char prev=s.charAt(0);
         int cnt=1;
         for(int i=1;i<n;i++)
         {
            if(prev!=s.charAt(i))
            {
                str+=cnt;
                str+=prev;
                cnt=0;
                prev=s.charAt(i);
            }
            cnt++;
            
         }
         str+=cnt;
         str+=prev;
         return str;
    }
}