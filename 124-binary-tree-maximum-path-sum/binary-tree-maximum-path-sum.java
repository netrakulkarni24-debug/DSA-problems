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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findpath(root);
        return maxsum;
    }


    int findpath(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = Math.max(0,findpath(root.left));
        int right = Math.max(0,findpath(root.right));

        int currentpath=left+right+root.val;

        maxsum=Math.max(maxsum,currentpath);

        return Math.max(left,right)+root.val;
    }
}