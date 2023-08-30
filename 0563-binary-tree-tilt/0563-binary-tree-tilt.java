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
    int k = 0;
    public int find(TreeNode root){
        if(root == null){
           return 0;
       } 
       
        int m = find(root.left);
        int n = find(root.right);
        k = k + Math.abs(m-n);
        root.val = m + n + root.val;
        return root.val;
    }
    public int findTilt(TreeNode root) {
        find(root);
        return k ;
    }
}