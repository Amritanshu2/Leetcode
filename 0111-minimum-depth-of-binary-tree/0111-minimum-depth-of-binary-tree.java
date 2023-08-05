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
    public int minDepth(TreeNode root) {
        if(root == null){return 0;}
        int lm = minDepth(root.left);
        int rm = minDepth(root.right);
        if(lm == 0){return rm+1;}
        if(rm == 0){return lm+1;}
        return Math.min(lm,rm)+1;
    }
}