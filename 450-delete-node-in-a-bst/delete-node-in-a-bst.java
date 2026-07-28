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
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        // Search left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // Search right subtree
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // Found the node
        else {

            // Case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: only right child
            else if (root.left == null) {
                return root.right;
            }

            // Case 2: only left child
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: two children
            else {
                TreeNode successor = findMin(root.right);

                root.val = successor.val;

                root.right = deleteNode(root.right, successor.val);
            }
        }

        return root;
    }


    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}