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
    int max = 0;
    
    public int longest (TreeNode root,int val){
        if(root == null){return 0;}
        if(root.val != val){return 0;}
        int left = longest(root.left,val);
        int right = longest(root.right,val);
        return 1+Math.max(left,right);
        
    }
    
    public void trav(TreeNode root){
        if(root == null){return ;}
        int a = longest(root.left,root.val);
        int b = longest(root.right,root.val);
        max = Math.max(max,a+b);
        trav(root.left);
        trav(root.right);
    }
    
    public int longestUnivaluePath(TreeNode root) {
        trav(root);
       return max; 
    }
}