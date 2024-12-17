/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        preorder(root,answer);
        return answer;
    }
    public List<Integer> preorder(TreeNode root,List answer)
    {
        if(root==null) return null;

        answer.add(root.val);
        preorder(root.left,answer);
        preorder(root.right,answer);

        return answer;
        
    }
}