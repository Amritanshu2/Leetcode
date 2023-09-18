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
    public boolean tr = true;
    public void sym(TreeNode root,TreeNode root1){
        if(root == null && root1 == null){return;}
        if((root!=null && root1==null || root1!=null && root==null)){tr = false;return;}
        if(  root.val != root1.val){tr = false;return;}
        sym(root.left,root1.right);
        sym(root.right,root1.left);
    }
    public boolean isSymmetric(TreeNode root) {
        sym(root.left,root.right);
        return tr;
    }
}