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
    Integer min = Integer.MAX_VALUE, prev = null;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root) {
        if(root == null) return;
        
       inorder(root.left);
       if(prev != null){
           min = Math.min(min, Math.abs(prev - root.val));
       }
        prev = root.val;
        
        inorder(root.right);
    }
}





