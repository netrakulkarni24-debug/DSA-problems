class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode node = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {

            TreeNode nodee = new TreeNode(preorder[i]);

            TreeNode curr = node;  // Start from root

            while (true) {

                if (nodee.val <= curr.val) {

                    if (curr.left == null) {
                        curr.left = nodee;
                        break;
                    } else {
                        curr = curr.left;
                    }

                } else {

                    if (curr.right == null) {
                        curr.right = nodee;
                        break;
                    } else {
                        curr = curr.right;
                    }

                }
            }
        }

        return node;
    }
}