class Solution {
    public String clearDigits(String s) {
        StringBuffer str=new StringBuffer();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}