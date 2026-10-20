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
    public int countNodes(TreeNode root) {
        return count(root, 0);
    }

    public int count(TreeNode root, int count) {
        if (root == null) {
            return 0;
        }

        // 1. First, calculate the left and right heights using your approach
        int left = leftHeight(root.left);
        int right = rightHeight(root.right);

        // 2. Check if it's a perfect binary tree
        if (left == right) {
            // Using your variable 'a' for the power calculation
            int a = (int) Math.pow(2, left + 1) - 1;
            return a;
        }

        // 3. Otherwise, recursively count left and right subtrees
        int leftVal = count(root.left, count + 1);
        int rightVal = count(root.right, count + 1);

        // 4. Using your 'sum' variable to total it up (+1 for the current root)
        int sum = 1 + leftVal + rightVal;
        
        return sum;
    }

    private int leftHeight(TreeNode root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }

    private int rightHeight(TreeNode root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.right;
        }
        return height;
    }
}