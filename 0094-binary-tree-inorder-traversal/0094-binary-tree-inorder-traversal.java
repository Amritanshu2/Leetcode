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
    
    public static List<Integer> pre(TreeNode root ,List<Integer>al){
        if(root==null){
            return al;
        }
        
        pre(root.left,al);al.add(root.val);
        pre(root.right,al);
        return al;
        
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> al = new ArrayList<>();
        return pre(root,al);
    }
}