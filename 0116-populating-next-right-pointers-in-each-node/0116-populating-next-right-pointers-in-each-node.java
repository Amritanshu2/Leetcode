/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    HashMap<Integer,ArrayList<Node>>hm = new HashMap<>();
    
    public void asd(Node root, int lvl){
        if(root==null){return;}
        
        if(!hm.containsKey(lvl)){ArrayList<Node>as = new ArrayList<>();hm.put(lvl,as);}
        hm.get(lvl).add(root);
        hm.put(lvl,hm.get(lvl));
        asd(root.left,lvl+1);
        asd(root.right,lvl+1);
    }
    public Node connect(Node root) {
        asd(root,0);
        
        for(int i = 0;i<hm.size();i++){
            for(int j = 0;j<hm.get(i).size()-1;j++){
                hm.get(i).get(j).next = hm.get(i).get(j+1);
            }
            hm.get(i).get(hm.get(i).size()-1).next = null;
                
        }
        return root;
        
    }
}