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
    
    int step = 0;
    
    public int distributeCoins(TreeNode root) {
        dis(root,null);
        return step;
             
    }
    
    public int dis(TreeNode root, TreeNode parent){
        if(root == null){return 0;}
        int a = 0;
        a+= dis(root.left,root);
        a+= dis(root.right,root);
        a += root.val-1;
        step += Math.abs(a);
        return a;
    }
}