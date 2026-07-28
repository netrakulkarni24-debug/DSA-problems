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
    int sum =0;
    private void  add(TreeNode root){
          if (root==null){
            return ;
        }

        if(root.left!=null && root.left.left==null && root.left.right==null){
              sum+=root.left.val;
        }

        add(root.left);
        add(root.right);

         
       
    }
    public int sumOfLeftLeaves(TreeNode root) {
       
        add(root);
        return sum;
      
    }
}