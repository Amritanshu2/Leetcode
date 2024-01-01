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
    
    public int tree(TreeNode root,int sum){
        if(root==null){return sum;}
        int right = tree(root.right,sum);
        root.val = root.val+right;
        int left = tree(root.left,root.val);
        return left;
    }
    
    
    public TreeNode convertBST(TreeNode root) {
        tree(root,0);
        return root;
    }
}