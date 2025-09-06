class Solution {
    public String defangIPaddr(String address) {
        String str="";
        int n=address.length();
        for(int i=0;i<n;i++)
        {
            char c=address.charAt(i);
            if(c=='.')
            {
                str+="[";
                str+=c;
                str+="]";
            }
            else{
                str+=c;
            }
        }
        return str;
    }
}