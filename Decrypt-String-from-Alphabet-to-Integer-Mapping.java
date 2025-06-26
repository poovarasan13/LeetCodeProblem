class Solution {
    public String freqAlphabets(String s) {
        String str="";
        int n=s.length();
        for(int i=0;i<n;)
        {
            if(i+2<n && (s.charAt(i+2))=='#')
            {
                int num=Integer.parseInt(s.substring(i,i+2));
                str+=(char)(num-1+'a');
                // System.out.print(s.substring(i,i+2)+'a');
                i+=3;
            }
            else{
                int num=s.charAt(i)-'0';
                str+=(char)(num-1+'a');
                i++;
            }
        }
        return str;
    }
}