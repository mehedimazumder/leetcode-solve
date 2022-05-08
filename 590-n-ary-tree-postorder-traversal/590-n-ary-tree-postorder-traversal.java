/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
        
        List<Integer> res = new ArrayList<>();
        
        
        
        for(Node node:root.children){
            res.addAll(postorder(node));
        }
        
        res.add(root.val);
        
        return res;
    }
}