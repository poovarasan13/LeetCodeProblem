class Solution {
    public void dfs(int n,String curr,List<String> answer)
    {
        if(curr.length()==n)
        {
            answer.add(curr);
            return;
        }

        for(char ch:new char[]{'a','b','c'}){
            if(curr.isEmpty() || curr.charAt(curr.length()-1)!=ch)
            {
                dfs(n,curr+ch,answer);
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String> answer=new ArrayList<>();
         dfs(n,"",answer);
        return k>answer.size() ? "" : answer.get(k-1);
    }
}