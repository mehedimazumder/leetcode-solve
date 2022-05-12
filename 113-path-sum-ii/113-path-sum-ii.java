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
    private List<List<Integer>> resultList = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return resultList;
        Stack<Integer> path = new Stack<Integer>();
        pathSumInner(root, targetSum, path);
        return resultList;
    }
    
    public void pathSumInner(TreeNode root, int targetSum, Stack<Integer> path) {
        if(root == null) return;
        path.push(root.val);
        
        if(root.left == null && root.right == null && root.val == targetSum) {
            resultList.add(new ArrayList<Integer>(path));
            path.pop();
            return;
        }       
        
        pathSumInner(root.left, targetSum - root.val, path);
        pathSumInner(root.right, targetSum - root.val, path);
        path.pop();
    }
}