class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        for(String str:sentences)
        {
            String[] s=str.split(" ");
            max=Math.max(s.length,max);
        }
        return max;
    }
}