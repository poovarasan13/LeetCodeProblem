class Solution {
    public int maxFreqSum(String s) {
       int n=s.length();
       int v_cnt=0,c_cnt=0;
       int [] freq=new int[26];
       for(int i=0;i<n;i++)
       {
            freq[s.charAt(i)-'a']++;
       } 
       for(int i=0;i<26;i++)
         {
            char ch=(char)(i+'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v_cnt=Math.max(v_cnt,freq[i]);
            else c_cnt=Math.max(c_cnt,freq[i]);
         }
         return v_cnt+c_cnt;
    }
}