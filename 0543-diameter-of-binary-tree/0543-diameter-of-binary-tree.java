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
    
    public int height(TreeNode node){
        if(node==null){return -1;}
        int hr = height(node.left);
        int hl = height(node.right);
        return Math.max(hr,hl)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){return 0;}
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        
        int lh = height(root.left);
        int rh = height(root.right);
        int myDia = lh+rh+2;
        return Math.max(ld,(Math.max(myDia,rd)));
        
    }
}