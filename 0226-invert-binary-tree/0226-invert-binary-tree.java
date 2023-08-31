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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){return null;}
        invertTree(root.left);
        invertTree(root.right);
        TreeNode newnode= new TreeNode(root.val);
        newnode.right = root.left;
        root.left = root.right;
        root.right = newnode.right;
        
        return root;
    }
}