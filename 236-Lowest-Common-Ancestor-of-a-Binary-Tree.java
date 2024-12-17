/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static boolean nodeToRoot(TreeNode root,TreeNode node,ArrayList<TreeNode> list)
    {
             if(root==null){
                return false;
             }
             if(node.val==root.val)
             {
                list.add(root);
                return true;
             }

             boolean ls=nodeToRoot(root.left,node,list);
             if(ls)
             {
                list.add(root);
                return true;
             }
             boolean rs=nodeToRoot(root.right,node,list);
             if(rs)
             {
                list.add(root);
                return true;
             }

             return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         ArrayList<TreeNode> plist=new ArrayList<>();
         ArrayList<TreeNode> qlist=new ArrayList<>();
         
         nodeToRoot(root,p,plist);
         nodeToRoot(root,q,qlist);
         int psize=plist.size()-1;
         int qsize=qlist.size()-1;

         while(psize>=0 && qsize>=0)
         {
            if(plist.get(psize)!=qlist.get(qsize))
            {
                break;
            }
            else{
                psize--;
                qsize--;
            }
         } 
         return qlist.get(qsize+1);
    }
}