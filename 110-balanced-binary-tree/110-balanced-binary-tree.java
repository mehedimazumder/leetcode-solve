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
    boolean checkImbalance = false;

    public boolean isBalanced(TreeNode root) {
        hightDiffCheck(root);
        return !checkImbalance;
    }
    
    public int hightDiffCheck(TreeNode root) {
        if(root == null) return 0;
        
        int left = hightDiffCheck(root.left);
        int right = hightDiffCheck(root.right);
        
        if(!checkImbalance){
            if(Math.abs(left - right) > 1)
                checkImbalance = true;
        }
        
        return Math.max(left, right) + 1;
    }
}









