class Solution {
    public boolean isString(String s,int i,int j)
    {
        String str=s.substring(i,j);
        
        for (char c : str.toCharArray()) {
            if (!(str.contains(Character.toString(Character.toLowerCase(c))) &&
                  str.contains(Character.toString(Character.toUpperCase(c))))) {
                return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) {
        int n=s.length();
        if(n==1) return "";
        String str="";
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if((j-i)>max&& isString(s,i,j))
                {
                    max=j-i;
                    str=s.substring(i,j);   
                }
            }
        }
        return str;
    }
}