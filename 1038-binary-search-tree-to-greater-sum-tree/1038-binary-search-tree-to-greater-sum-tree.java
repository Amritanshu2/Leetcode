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
    List<Integer>al = new ArrayList<>();
    
    public TreeNode bstToGst(TreeNode root) {
        al.add(0);
        
        trav(root);
        return root;
    }
    
    public void trav(TreeNode root){
        if(root == null){return;}
        trav(root.right);
        root.val = root.val + al.get(al.size()-1);
        al.add(root.val);
        trav(root.left);
        
    }
}