class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int cnt=0;
        for(int i=0;i<s1.length();i++)
        {
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(a!=b) cnt++;
            if(cnt>2) return false;
            freq1[a-'a']++;
            freq2[b-'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}