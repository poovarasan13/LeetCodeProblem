class Solution {
    public int minLength(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
           if(st.isEmpty())
           {
            st.push(ch);
            continue;
           }
                if(ch=='B' && st.peek()=='A')st.pop();
                else if(ch=='D' && st.peek()=='C')st.pop();
            else st.push(ch);
        }
        // while(!st.isEmpty())
        // {
        //     System.out.println(st.pop());
        // }
        return st.size();
    }
}