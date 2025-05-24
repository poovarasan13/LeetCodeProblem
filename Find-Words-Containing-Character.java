class Solution {
    public Boolean Contians(String str,char c)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==c) return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            // if(words[i].indexOf(x)!=-1)
             if(Contians(words[i],x))
             list.add(i);
        }
        return list;
    }
}