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
    int maxDia = 0;
    public int maxHD(TreeNode root){
         if(root==null){
            return 0;
        }

        int leftH = maxHD(root.left);
        int rightH = maxHD(root.right);

        maxDia = Math.max(maxDia, leftH+rightH);
        return Math.max(leftH,rightH)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {

       maxHD(root);
       return maxDia;
    }
}
