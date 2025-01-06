class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String ans="";
        // for(int i=0;i<str.length;i++)
        // {
        //     System.out.print(str[i]+" ");
        // }
        for(int i=str.length-1;i>=0;i--)
        {    ans+=str[i];
            if(i!=0) ans+=" ";
        }
        return ans;
    }
}