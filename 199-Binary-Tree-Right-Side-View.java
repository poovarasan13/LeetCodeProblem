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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<Integer> answer=new ArrayList<>();
        if(root==null) return answer;
        que.add(root);
          
        while(!que.isEmpty())
        {

            int size=que.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=que.poll();
                if(i==size-1)
                answer.add(node.val);
                  if(node.left!=null)
                {
                    que.add(node.left);
                }
                if(node.right!=null)
                {
                    que.add(node.right);
                }

            }
        }

        return answer;
    }
}