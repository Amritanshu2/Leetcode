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
    
    int level = 0;
    
    public void depth(Node root,int lvl){
        if(root == null){return;}
        level = Math.max(lvl,level);
        for(int i = 0;i<root.children.size();i++){
            depth(root.children.get(i),lvl+1);
        }
    }
    
    
    public int maxDepth(Node root) {
        depth(root,1);
        return level;
    }
}