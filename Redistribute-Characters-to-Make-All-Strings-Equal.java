class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq=new int[26];
        int n=words.length;
        for(String w:words){
            for(char c:w.toCharArray())
            {
                freq[c-97]++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0 && freq[i]%n!=0) return false;
        }
        return true;
    }
}