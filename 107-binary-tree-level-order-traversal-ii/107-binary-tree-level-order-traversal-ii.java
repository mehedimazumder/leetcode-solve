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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelItems(res, root, 0);
        return res;
    }
    
    // using DFS
    public void levelItems(List<List<Integer>> items, TreeNode node, int level){
        if(node == null) return;
        if(level >= items.size())
            items.add(0, new ArrayList<>());
        
        levelItems(items, node.left, level+1);
        levelItems(items, node.right, level+1);
        items.get(items.size() - level - 1).add(node.val);
    }
}