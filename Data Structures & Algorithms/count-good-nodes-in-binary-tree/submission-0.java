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
    private int count =0;
    public void goods(TreeNode root,int max){
        if(root==null) return;
        if(root.val >=max){
            count++;
            max = Math.max(max,root.val);
        }
        goods(root.left,max);
        goods(root.right,max);
        return;
    }
    public int goodNodes(TreeNode root) {
        goods(root,root.val);   
        return count;                    //(2,2) count=1,
    }
}
