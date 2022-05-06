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
        if(root == null) return 0;
        
        int depth = 0;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        
        while(queue.size() != 0){
            int size = queue.size();
            
            while(size != 0){
                TreeNode node = queue.poll();
                
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                
                size--;
            }
            depth++;
        }
        return depth;
    }
}