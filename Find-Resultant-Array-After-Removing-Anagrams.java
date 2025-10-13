class Solution {
    public boolean isAnagram(String s, String t) {
    char[] charArray1 = s.toCharArray();
    char[] charArray2 = t.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
   return Arrays.equals(charArray1, charArray2);
}
    public List<String> removeAnagrams(String[] words) {
         int len=words.length;
        //  int i=1;
         List<String> list=new ArrayList<>();
         list.add(words[0]);
         for(int i=1;i<len;i++)
         {
              if(!isAnagram(words[i],words[i-1]))
                 list.add(words[i]);
         }                              
         return list;            
    }
}