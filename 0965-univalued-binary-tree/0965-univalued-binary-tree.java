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
    
    public boolean tree(TreeNode root , int n) {
        if(root==null){return true;}
        if(root.val != n){return false;}
        if(tree(root.left ,n) == true && tree(root.right ,n)==true){return true;}
        return false;
        
        
    }
    
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){return true;}
        int n = root.val;
        return tree(root ,n);
        
    }
}