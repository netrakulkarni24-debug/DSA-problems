class Solution {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        // 1. Traverse left subtree (smallest elements first)
        inorder(node.left, k);

        // 2. Visit current node
        count++;
        if (count == k) {
            result = node.val;
            return; // Found the kth element
        }

        // 3. Early exit optimization: stop searching if we already found k
        if (count < k) {
            inorder(node.right, k);
        }
    }
}