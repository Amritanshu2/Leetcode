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
    
    public TreeNode tree(TreeNode root1, TreeNode root2){
        if(root1!=  null && root2!=null){
            TreeNode temp = new TreeNode(root1.val+root2.val);
           
            temp.left = tree(root1.left,root2.left);
            temp.right = tree(root1.right,root2.right);
            return temp;
        }
        else if(root1!=  null && root2==null){
            TreeNode temp = new TreeNode(root1.val);
            
            temp.left= tree(root1.left,null);
            temp.right = tree(root1.right,null);
            return temp;
        }
        else if(root1==  null && root2!=null){
            TreeNode temp = new TreeNode(root2.val);
            
            temp.left = tree(null,root2.left);
            temp.right = tree(null,root2.right);
            return temp;
        }
        else{
            return null;
        }
    }
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
       
        return tree(root1, root2);
        
    }
}