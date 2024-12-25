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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        if(root==null) return  answer;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty())
        {
           
            int size=que.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode node=que.poll();
                if(max<node.val) max=node.val;

                if(node.left!=null)  que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            answer.add(max);
        }
        return answer;
    }
}