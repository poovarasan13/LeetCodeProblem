class Solution {
    public String makeGood(String s) {
      Stack<Character> st=new Stack<>();
      for(char ch:s.toCharArray())
      {
        if(!st.isEmpty() && Math.abs(st.peek()-ch)==32) st.pop();
        else st.push(ch);
      } 
      String str=""; 
      while(!st.isEmpty())
      {
        str=st.pop()+str;
        // System.out.print(st.pop());
      }
      return str;
    }
}