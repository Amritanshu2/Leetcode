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
    public TreeNode first;
    public TreeNode prev;
    public TreeNode middle;
    public TreeNode last;
    
    public void inorder (TreeNode root){
        if(root== null){return ;}
        inorder(root.left);
        if(prev != null && (root.val<prev.val)){
            if(first ==null){
                first = prev;
                middle = root;
            }
            else{last = root;}
        }
        prev = root;
        inorder(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        first = middle = last = prev = null;
        inorder(root);
        if(first!=null && last!= null){
            int a = first.val; 
            first.val = last.val;
            last.val = a;
        }
        else{
            int a = first.val; 
            first.val = middle.val;
            middle.val = a;
        }
        
    }
}