class Solution {

    boolean temp = true;

    public void tree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return;

        if (p == null || q == null) {
            temp = false;
            return;
        }

        if (p.val != q.val) {
            temp = false;
            return;
        }

        tree(p.left, q.left);
        tree(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        tree(p, q);
        return temp;
    }
}