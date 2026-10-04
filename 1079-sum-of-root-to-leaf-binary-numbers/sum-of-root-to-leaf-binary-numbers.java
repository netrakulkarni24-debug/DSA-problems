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
    int sum=0;
    public void path(TreeNode root,List<Integer> pathe){
        if(root==null){
            return ;
        }
 
        pathe.add(root.val);


        if(root.left==null && root.right==null){
              int num=0;
              for(int i=0;i<pathe.size();i++){
                num=num*2+pathe.get(i);
              }
              sum=sum+num;
        }
        else{
            path(root.left,pathe);
            path(root.right,pathe);
        }
        pathe.remove(pathe.size()-1);
    }
    public int sumRootToLeaf(TreeNode root) {
   path(root,new ArrayList<>());
              return sum;
        
    }
}