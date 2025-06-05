class Solution {
    public String stack(String str){
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray())
        {
            if(!st.isEmpty() && ch=='#') st.pop();
            else if(ch=='#');
            else st.push(ch);
        }
        String s="";
        while(!st.isEmpty())
        {
            s=st.pop()+s;
        }
        return s;
    }
    public boolean backspaceCompare(String s, String t) {
        // System.out.println(stack(s) + " "+ stack(t));
        return stack(s).equals(stack(t));
    }
}