class Solution {
    public String robotWithString(String s) {
       int n=s.length();
       int [] freq=new int[26];
       for(char c:s.toCharArray())
       {
         freq[c-'a']++;
       }
       StringBuilder str=new StringBuilder();
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray())
       {
       
        st.push(c);
        freq[c-'a']--;
        while(!st.isEmpty() && st.peek()<=hasSmaller(freq))
        {
            str.append(st.pop());
        }
       }
       while(!st.isEmpty())
       {
        str.append(st.pop());

       }
       return str.toString();
    }
    public char hasSmaller(int[] freq)
    {
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0) return (char)(i+'a');
        }
        return 'a';
    }
}