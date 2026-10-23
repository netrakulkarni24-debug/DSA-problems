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
    public static class Pair{
             TreeNode node ;
             long index;

             Pair(TreeNode node , long index){
                this.index=index;
                this.node=node;
             }


    }
    public int widthOfBinaryTree(TreeNode root) {
    if(root==null){
        return 0;
    }


    Queue<Pair>q = new LinkedList<>();
      q.offer(new Pair(root,0));

      long maxwidth=0;

      while(q.size()>0){
        int current = q.size();

        long startindex = q.peek().index;
        long endindex = q.peek().index;

        for(int i=0;i<current;i++){
            Pair curr = q.poll();

            TreeNode node = curr.node;
            long index = curr.index;

            endindex=index;

                      if(node.left!=null){
                        q.offer(new Pair(node.left,2*index+1));
                      }

                      if(node.right!=null){
                        q.offer(new Pair(node.right,2*index+2));
                      }

        }
      

      maxwidth = Math.max(maxwidth,endindex-startindex+1);

    }

    return (int) maxwidth;
    }
}