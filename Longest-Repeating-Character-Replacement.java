class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int start=0,max=0;
        for(int end=0;end<s.length();end++)
        {
            max=Math.max(max, ++freq[s.charAt(end)-'A']);
            while(max+k<end-start+1)
            {
                freq[s.charAt(start)-'A']--;
                start++;
            }
        }
        return s.length()-start;
    }
}