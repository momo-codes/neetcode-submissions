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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count =0;
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n==null){
                count++;
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
             if(n.left!=null)q.add(n.left);
             if(n.right!=null)q.add(n.right);
            }
        }
        return count;
    }
}
