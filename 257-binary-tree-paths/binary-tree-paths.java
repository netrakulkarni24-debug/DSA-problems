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

    public void path(TreeNode root, List<String> path, List<String> ans) {

        if (root == null) {
            return;
        }

        path.add(root.val + "");

        // leaf node
        if (root.left == null && root.right == null) {

            ans.add(String.join("->", path));

        } else {

            path(root.left, path, ans);
            path(root.right, path, ans);
        }

        // backtracking
        path.remove(path.size() - 1);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        path(root, path, ans);

        return ans;
    }
}