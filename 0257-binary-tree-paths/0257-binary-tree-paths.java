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
    
    
    public List<String> path (TreeNode root,List al , String s){
        if(root == null){return al;}
        if(root.left == null && root.right == null){
            s = s + root.val;
            al.add(s);
            return al;
        }
        s = s+ root.val + "->";
        path(root.left,al,s );
        path(root.right,al,s);
        return al;
    }
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> al = new ArrayList<>();
        return path(root,al,"");
        
    }
}