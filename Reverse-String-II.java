class Solution {
    public void rev(int i,int j,char[] str)
    {
        while(i<j)
        {
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int e=i+k-1;
            if(e>s.length()-1) e=s.length()-1;
            rev(i,e,str);
        }
        return new String(str); 
    }
}