class Solution {
    public boolean vowel(char c)
    {
        return c=='a'|| c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int maxVowels(String s, int k) {
        int cnt=0,max=0;
        for(int i=0;i<k;i++)
        {
            if(vowel(s.charAt(i)))
                 cnt++;
        }
        max=cnt;
        for(int i=k;i<s.length();i++)
        {
            if(vowel(s.charAt(i-k)))  cnt--;
            if(vowel(s.charAt(i))) cnt++;
            max=Math.max(max,cnt);
        }
           return max;
    }
}