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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> ans=new LinkedList<>();
       
         ans.add(root);
        List<List<Integer>> result=new ArrayList<>();
        
         if(root==null) return result;
        while(!ans.isEmpty())
        {
            List<Integer> answer=new ArrayList<>();
              int size=ans.size();
             for(int i=0;i<size;i++)
             {
                TreeNode node=ans.poll();
                // if(node!=null )
                // if(i==size-1)
                answer.add(node.val);
                if(node.left!=null)
                {
                    ans.add(node.left);
                }
                if(node.right!=null)
                {
                    ans.add(node.right);
                }              
             }   

             result.add(answer);      
        }
        return result;
    }
}