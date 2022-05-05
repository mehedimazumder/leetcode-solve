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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        
        queue.add(root);
        
        while(queue.size() != 0){
            int size = queue.size();
            List<Integer> layer_vals = new ArrayList<Integer>();
            
            while(size != 0){
                TreeNode node = queue.poll();
                layer_vals.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                
                size--;
            }
            res.add(layer_vals);
        }
        return res;
    }
}





