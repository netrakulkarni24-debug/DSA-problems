class Solution {
    public boolean isValid(TreeNode root, long minvalue, long maxvalue) {
        if (root == null) {
            return true;
        } 
        if (root.val >= maxvalue || root.val <= minvalue) {
            return false;
        } 
        return isValid(root.left, minvalue, root.val) && isValid(root.right, root.val, maxvalue); 
    } 

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE); 
    }
}