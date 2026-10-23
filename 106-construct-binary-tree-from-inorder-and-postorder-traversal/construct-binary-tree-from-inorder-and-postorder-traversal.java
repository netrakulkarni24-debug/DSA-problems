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
    int search(int[] inorder, int left, int right, int val) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    TreeNode helper(int[] postorder, int[] inorder, int[] postindex, int left, int right) {
        // Base case: if there are no elements to construct the sub-tree
        if (left > right) {
            return null;
        }
        
        // 1. Get the current root value from the end of the postorder segment
        int rootVal = postorder[postindex[0]];
        postindex[0]--; // Move backward for the next root
        
        TreeNode root = new TreeNode(rootVal);
        
        // 2. Find where this root sits in the inorder traversal
        int indx = search(inorder, left, right, rootVal);
        
        // 3. IMPORTANT: Build the RIGHT subtree first, then the LEFT subtree
        // (Because postorder visits left -> right -> root, going backwards goes root -> right -> left)
        root.right = helper(postorder, inorder, postindex, indx + 1, right);
        root.left = helper(postorder, inorder, postindex, left, indx - 1);
        
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start the pointer at the very last index of the postorder array
        int[] postindex = {postorder.length - 1};
        return helper(postorder, inorder, postindex, 0, inorder.length - 1);
    }
}