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
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return generate(preorder, 0, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode generate(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd){
        if(preStart >= preorder.length || inStart > inEnd)
            return null;
        
        int val = preorder[preStart];
        int inIdx = map.get(val);
        
        TreeNode node = new TreeNode(val);
        node.left = generate(preorder, preStart+1, inorder, inStart, inIdx-1);
        node.right = generate(preorder, preStart + inIdx - inStart + 1,inorder, inIdx+1, inEnd);
        return node;
    }
}















