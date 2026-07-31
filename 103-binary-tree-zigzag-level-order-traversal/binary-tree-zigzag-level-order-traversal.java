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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
          int level = 0;

        if (root == null)
            return ans;

        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            LinkedList<Integer> levell = new LinkedList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (level%2!=0)
                    levell.addFirst(node.val);
                else
                    levell.addLast(node.val);

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }
            

            ans.add(levell);
           level++;
        }

        return ans;
    }
}