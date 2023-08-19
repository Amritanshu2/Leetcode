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
    
    public boolean sum(TreeNode root,int tar , int a ){
        if(root == null){
            // if(a == tar){return true;}
            return false;
        }
        if(root.left == null && root.right == null){
            a = a + root.val;
            if(a == tar){return true;}
            return false;
        } 
        a = a + root.val;
        boolean s = sum(root.left,tar,a);
        boolean d = sum(root.right,tar,a);
        if(s == true || d == true){return true; }
        return false;
    }
    
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int a = 0;
        return sum(root,targetSum,a);
        
    }
}