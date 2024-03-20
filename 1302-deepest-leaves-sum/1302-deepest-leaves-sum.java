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
    HashMap<Integer,Integer>hm = new HashMap<>();
    int level = 0;
    
    public void trav(TreeNode root,int lvl){
        if(root == null){return;}
        level = Math.max(lvl,level);
        hm.put(lvl,hm.getOrDefault(lvl,0)+root.val);
        trav(root.left,lvl+1);
        trav(root.right,lvl+1);
    }
    public int deepestLeavesSum(TreeNode root) {
        trav(root,0);
        return hm.get(level);
    }
}