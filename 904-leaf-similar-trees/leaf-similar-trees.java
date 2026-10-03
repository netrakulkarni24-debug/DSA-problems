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
    List<Integer> sett1 = new ArrayList<>();
    List<Integer> sett2= new ArrayList<>();
    public void   tie(TreeNode root,List<Integer> set ){
        if(root==null){
           return ;
        }
        if(root.left==null && root.right==null){
            set.add(root.val);
            return;
        }
        tie(root.left,set);
        tie(root.right,set);


        

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    
        tie(root1,sett1);
        tie(root2,sett2);

        return sett1.equals(sett2);

     
}

}