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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        int rightMost = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n==null){
                ans.add(rightMost);
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                 rightMost = n.val;
            if(n.left !=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
            }
           
        }
        return ans;
    }
}
