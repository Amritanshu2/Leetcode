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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
         sub(root);
        return sm;
        }
    TreeNode sm ;
    public void sub(TreeNode root){
        if(root == null){return;}
        if(height(root.right) == height(root.left)){sm = root;return;}
        if(height(root.right) > height(root.left)){
            sub(root.right);
        }
        else{
            sub(root.left);
        }
    }
        
    public int height(TreeNode root){
        if(root == null){return 0;}
        int l = height(root.left)+1;
        int r = height(root.right)+1;
        return Math.max(l,r);
    }
}