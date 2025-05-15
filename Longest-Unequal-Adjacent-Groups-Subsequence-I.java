class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n=words.length;
        int index=-1;
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(groups[i]!=index)
            {
                index=groups[i];
                list.add(words[i]);
            }
        }
        return list;
    }
}