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
    
    public Stack<Integer> st = new Stack<>();String ss = "";
    public void helpr(TreeNode root){
        if(root==null){
           
            return;
        }
        if(root.left==null && root.right==null){
            ss = ss + root.val;
            return;
        }
        
        
        ss = ss + root.val;
        ss = ss + '(';
        helpr(root.left);
        ss = ss + ')';
        if(root.right!=null){
        ss = ss + '(';
        helpr(root.right);
        ss = ss + ')';}
        // System.out.println(ss);
        return;
    }
    
    
    public String tree2str(TreeNode root) {
        
        helpr(root);
       
        return ss;
    }
}