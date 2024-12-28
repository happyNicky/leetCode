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

    public int minDepth(TreeNode root) {
         if(root==null)
          return 0;
         Queue<TreeNode> mq= new LinkedList<>();
         mq.add(root);
         int depth=0;
         while(!mq.isEmpty())
         {   depth++;
             int size= mq.size();
             for(int i=0;i<size;i++)
             {  TreeNode temp= mq.peek();
                 mq.poll();
                if(temp.right==null && temp.left==null )
                   return depth;
                if(temp.left!=null)
                   mq.add(temp.left);
                if(temp.right!=null)
                   mq.add(temp.right);
             }
         }
         return depth;

         
    }
}