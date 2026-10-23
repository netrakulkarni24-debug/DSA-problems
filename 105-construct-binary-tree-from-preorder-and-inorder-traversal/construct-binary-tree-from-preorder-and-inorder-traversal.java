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
    
    int search( int [] inorder, int left,int right,int val){
        for(int i=left;i<=right;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }

    TreeNode helper (int [] preorder , int [] inorder , int[] preindex, int left, int right){
        if(left>right){
            return null;
        }
            TreeNode root = new TreeNode(preorder[preindex[0]]);
        int currIndex = preindex[0];
        preindex[0]++;
        int indx= search(inorder,left,right,preorder[currIndex]);
        root.left=helper(preorder,inorder,preindex,left,indx-1);
        root.right=helper(preorder,inorder,preindex,indx+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int[] preindex={0};
        return helper(preorder,inorder,preindex,0,inorder.length-1);
        
    }
}