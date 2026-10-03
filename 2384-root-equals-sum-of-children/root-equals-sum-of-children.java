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
    int sumi=0;
    public int sum(TreeNode root){
  
            if(root==null){
                return 0;
            }
            
           
            
            return  root.left.val+root.right.val;

    }
    public boolean checkTree(TreeNode root) {
      
     return (sum(root)==root.val);
        
        
    }
}