class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set=new HashSet<>();
        for(char c:brokenLetters.toCharArray())
        {
            set.add(c);
        }
        int cnt=0;
        String[] str=text.split(" ");
        for(String s:str)
        {
            for(char ch:s.toCharArray())
            {
                if(set.contains(ch))
                {
                    cnt++;
                    break;
                }
            }
        }
        return str.length-cnt;
    }
}