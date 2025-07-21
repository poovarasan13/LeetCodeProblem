class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        char ch=s.charAt(0);
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=ch)
            {
            ch=s.charAt(i);
            cnt=0;
            }
            cnt++;
            if(cnt>2) continue;
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}