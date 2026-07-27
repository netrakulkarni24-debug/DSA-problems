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
    public List<List<Integer>> levelOrder(TreeNode root) {
           List<List<Integer>> ans = new ArrayList<>();
           if(root==null){
            return ans;
           }

           Queue<TreeNode> queue = new LinkedList<>();

           queue.offer(root);

           while(!queue.isEmpty()){
            int size = queue.size();
            List <Integer> list  = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode front = queue.poll();
                   list.add(front .val);
                   if(front.left!=null) queue.offer(front.left);
                   if(front.right!=null) queue.offer(front.right);
            }
            ans.add(list);
           }

           return ans ;
    }
}