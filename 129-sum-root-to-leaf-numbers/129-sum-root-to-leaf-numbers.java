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
    List<String> pathNums = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        getPaths(root, new StringBuilder());
        
        int res = 0;
        for(String num:pathNums)
            res += Integer.valueOf(num);
        return res;
    }
    
    public void getPaths(TreeNode root, StringBuilder sb) {
        if(root == null) return;
        sb.append(root.val);
        if(root.left == null && root.right == null) 
            pathNums.add(sb.toString());
        
        getPaths(root.left, sb);
        getPaths(root.right, sb);
        
        sb.setLength(sb.length() - 1);
    }
}