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
    List<TreeNode>al = new ArrayList<>();
    
    public void trav(TreeNode root){
        if(root == null){return;}
        trav(root.left);
        al.add(root);
        trav(root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        trav(root);
        return create(0,al.size()-1);
        
    }
    
    public TreeNode create(int i,int f){
        if(i > f){return null;}
        TreeNode root = al.get((i+f)/2);
        root.left = create(i,(i+f)/2-1);
        root.right = create((i+f)/2+1,f);
        return root;
    }
}