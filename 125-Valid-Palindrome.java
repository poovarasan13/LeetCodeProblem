class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase();
       
        char[] c=s.toCharArray();
         for(int i=0;i<s.length();i++)
        {
            if(c[i]>='A' && c[i]<='Z')
            {
               c[i]=(char)(c[i]+32);

            }
        }
        String str="";
        
        for(int i=0;i<c.length;i++)
        {
            if((c[i]>='a' && c[i]<='z') || (c[i]>='0' && c[i]<='9') )
               str+=c[i];
        }
        int start=0,end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
              return false;
              start++;
              end--;
        }
        return true;
    }
}