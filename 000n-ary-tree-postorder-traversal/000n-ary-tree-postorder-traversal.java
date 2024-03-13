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
        hlpr(root);
        return al;
    }
    List<Integer>al = new ArrayList<>();
    public void hlpr(Node root){
        if(root == null){return;}
        
        List<Node>cld = root.children;
        for(int i = 0;i<cld.size();i++){
            hlpr(cld.get(i));
        }
        al.add(root.val);
        
    }
}