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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int answer=root.val; 

        while(!que.isEmpty())

        {

            int size=que.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=que.poll();
                if(i==0)
                   answer=temp.val;
                if(temp.left!=null)
                {
                    que.add(temp.left);
                }
                 if(temp.right!=null)
                {
                    que.add(temp.right);
                }
            }
        }
        return answer;
    }
}