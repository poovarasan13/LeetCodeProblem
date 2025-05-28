class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n=strs.length;
        Arrays.sort(strs);
        if(n==1) return strs[0];
        String first=strs[0],last=strs[n-1];
        String str=\\;
        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
              if(first.charAt(i)!=last.charAt(i)) return str;
              str+=first.charAt(i);
        }
        return str;
    }
}