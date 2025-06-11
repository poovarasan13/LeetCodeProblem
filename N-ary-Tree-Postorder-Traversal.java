/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> answer=new ArrayList<>();
        if(root==null) return answer;
        dfs(root,answer);
        return answer;
    }
    public void dfs(    Node node,List<Integer> answer)
    {
        for(Node child: node.children)
        {
            dfs(child,answer);
        }
        answer.add(node.val);
    }
}