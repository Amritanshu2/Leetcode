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
    
    public void sum(TreeNode root , List<List<Integer>> al ,List as , int tar){
        if(root == null){return; }
        
        
        
        if(root.left == null && root.right == null){
            if(tar-root.val==0){
                ArrayList<Integer>base = new ArrayList<>(as);
                base.add(root.val);
                al.add(base);
                }
            return ;
        }
        as.add(root.val);
        sum(root.left,al,as,tar-root.val);
        sum(root.right,al,as,tar - root.val);
        as.remove(as.size()-1);
        
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>al = new ArrayList<List<Integer>>();
        List<Integer> as = new ArrayList<>();
        sum(root,al,as,targetSum);
        return al;
    }
}