/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Node root = new  Node();
        root = tree(node,root);
        return root;
    }
    HashMap<Integer,Node> hm = new HashMap<>();
    
    public Node tree(Node node, Node root){
        if(node == null){return null;}
        root.val = node.val;
        hm.put(root.val,root);
        // hs.add(node);
        List<Node>al = new ArrayList<>();
        for(int i = 0;i<node.neighbors.size();i++){
            if(hm.containsKey(node.neighbors.get(i).val)){al.add(hm.get(node.neighbors.get(i).val));continue;}
            Node temp = new  Node();
            
            al.add(tree(node.neighbors.get(i),temp));
        }
        // System.out.println(al);
        root.neighbors = al;
        return root;
    }
}