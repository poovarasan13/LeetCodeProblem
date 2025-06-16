class Solution {
    public String generateTag(String caption) {
       String[] str=caption.trim().split("\\s+");
       StringBuilder ans=new StringBuilder("#");
        
       int n=str.length;
        for(int i=0;i<n;i++)
            {
                String temp=str[i];
                String s="";
                if(i==0)
                {
                    s=temp.toLowerCase();
                }
                else{
        s=temp.substring(0,1).toUpperCase()+(temp.substring(1).toLowerCase());
                }
                // if(ans.length()+s.length()>100)break;
            ans.append(s);
            }
        if(ans.toString().length()>100) return ans.toString().substring(0,100);
        return ans.toString();
    }
}