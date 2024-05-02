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
    int a = 0;int tot = 0;
    public int averageOfSubtree(TreeNode root) {
        tree(root);
        return tot;
    }
    
    public void tree(TreeNode root){
        if(root == null){return;}
        a = 0;
        int s = sum(root);
        if(s/a == root.val){tot++;}
        tree(root.left);
        tree(root.right);
    }
    
    public int sum(TreeNode root){
        if(root == null){return 0;}
        int left = sum(root.left);
        int right = sum(root.right);
        a++;
        return left + right + root.val;
    }
}