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
    boolean tre = false;
    
    public void check(int k ,TreeNode  rew,int ans){
        if(rew==null || tre==true){return;}
        if(rew.val==k && ans != rew.val){tre = true;}
        check(k,rew.left,ans);
        check(k,rew.right,ans);
    }
    
    public void inor(TreeNode root,int k,TreeNode rew){
        if(root==null || tre==true){return;}
        
        check(k- root.val,rew,root.val);
        inor(root.left,k,rew);
        inor(root.right,k,rew);
    }
    public boolean findTarget(TreeNode root, int k) {
        // rew = root;
        inor(root,k,root);
        return tre;
    }
}