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
    HashMap<Integer,Integer> hm = new HashMap<>();
    public void node (TreeNode root,int n){
        if(root == null){return;}
        node(root.right,n+1);
        if(!hm.containsKey(n)){hm.put(n,root.val);}
        
        node(root.left,n+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        node(root,0);
        List<Integer>al = new ArrayList<>();
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            Integer key = mapElement.getKey();
            al.add(hm.get(key));
        }
        return al;
    }
}


