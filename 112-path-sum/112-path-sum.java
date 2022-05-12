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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return checkPathSum(root, targetSum);
    }
    
    public boolean checkPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        if(root.left == null && root.right == null) return root.val == targetSum;
        
        return checkPathSum(root.left, targetSum - root.val) || checkPathSum(root.right, targetSum - root.val);
    }
}