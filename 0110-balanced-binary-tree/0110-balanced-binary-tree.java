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
    boolean sd = true;
     public int maxDepth(TreeNode root) {
        if(root == null){return 0;}
        int lm = maxDepth(root.left);
        int rm = maxDepth(root.right);
        return Math.max(lm,rm)+1;
    }
    public void bok(TreeNode root){
        if(root==null){return ;}
        int n = maxDepth(root.left);
        int m = maxDepth(root.right);
        bok(root.left);
        bok(root.right);
        System.out.println(Math.abs(n-m));
        if(Math.abs(n-m)>1){sd = false;return;}
        
    }
    public boolean isBalanced(TreeNode root) {
        bok(root);
        return sd;
    }
}