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
    
    public List<Integer> preoder(Node root) {
        ArrayList<Integer>al = new ArrayList<>();
        if(root==null){return al;}
        // al.add(root.val);
        
        
        for(Node child : root.children){
            al.add(child.val);
            
            al.addAll(preoder(child));
        }
        return al;
    }
    
    
    
    public List<Integer> preorder(Node root) {
        List<Integer>al = preoder(root);
        if(root!=null)
        al.add(0,root.val);
        return al;
    }
}