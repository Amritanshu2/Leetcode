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
        root = tree(node,root,new HashSet<>());
        return root;
    }
    HashMap<Integer,Node> hm = new HashMap<>();
    
    public Node tree(Node node, Node root, HashSet<Node>hs){
        if(node == null){return null;}
        root.val = node.val;
        hm.put(root.val,root);
        hs.add(node);
        List<Node>al = new ArrayList<>();
        for(int i = 0;i<node.neighbors.size();i++){
            if(hs.contains(node.neighbors.get(i))){al.add(hm.get(node.neighbors.get(i).val));continue;}
            Node temp = new  Node();
            
            al.add(tree(node.neighbors.get(i),temp,hs));
        }
        // System.out.println(al);
        root.neighbors = al;
        return root;
    }
}