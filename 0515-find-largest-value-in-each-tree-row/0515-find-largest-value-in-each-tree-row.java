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
    HashMap<Integer,Integer>hm = new HashMap<>();
    
    public void tree(int i ,TreeNode root){
        if(root == null){return ;}
        if(hm.containsKey(i)){if(hm.get(i)<root.val){hm.put(i,root.val);}}
        else{hm.put(i,root.val);}
        tree(i+1,root.left);
        tree(i+1,root.right);
    }
    
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer>al = new ArrayList<>();
        tree(0,root);
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
        Integer key = entry.getKey();
        al.add(hm.get(key));
        }
        return al;
        
    }
}