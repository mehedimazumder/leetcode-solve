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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
    
    
        // public int minDepth(TreeNode root) {
        // if(root == null) return 0;
        // int depth = 1;
        // Queue<TreeNode> q = new LinkedList<TreeNode>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     // for each level
        //     for(int i=0;i<size;i++){
        //         TreeNode node = q.poll();
        //         if(node.left == null && node.right == null){
        //             return depth;
        //         }
        //         if(node.left != null){
        //             q.offer(node.left);
        //         }
        //         if(node.right != null){
        //             q.offer(node.right);
        //         }
        //     }
        //     depth++;
        // }
        // return depth;
        // }
}