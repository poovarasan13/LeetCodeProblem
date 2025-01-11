class Solution {
    public String simplifyPath(String path) {
        String[] p=path.split("/");
       
        Stack<String> st=new Stack<>();
        for(String str:p)

        {
           
             if(str.equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else if(!str.equals(".") && !str.isEmpty())
                st.push(str);
               
        }
        StringBuilder answer=new StringBuilder();
        for(String s:st)
        {
            answer.append("/").append(s);
        }
        if(answer.length()>0)
               return answer.toString();
        return "/";
    }
}