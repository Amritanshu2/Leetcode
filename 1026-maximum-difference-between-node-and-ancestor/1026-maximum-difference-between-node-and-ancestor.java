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
    
    int m = -(int)1e8;
    
    public void max(TreeNode root, ArrayList<Integer>al){
        if(root == null){return;}
        for(int i = 0;i<al.size();i++){
            m = Math.max(m,(Math.abs(root.val-al.get(i))));
        }
        al.add(root.val);
        max(root.left,al);
        max(root.right,al);
        al.remove(al.size()-1);
    }
    
    public int maxAncestorDiff(TreeNode root) {
        max(root,new ArrayList<>());
        return m;
    }
}