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

    public int second(TreeNode root) {
        if (root == null) return -1;

        if (root.left == null && root.right == null)
            return -1;

        int left, right;

        if (root.left.val == root.val)
            left = second(root.left);
        else
            left = root.left.val;

        if (root.right.val == root.val)
            right = second(root.right);
        else
            right = root.right.val;

        if (left == -1) return right;
        if (right == -1) return left;

        return Math.min(left, right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        return second(root);
    }
}